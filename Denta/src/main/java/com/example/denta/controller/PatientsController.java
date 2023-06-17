package com.example.denta.controller;


import com.example.denta.entity.Doctor;
import com.example.denta.entity.Patients;
import com.example.denta.service.PatientsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static com.example.denta.controller.DoctorController.DEFAULT_GROUP_ID;

@Controller
public class PatientsController {

	private static final int ITEMS_PER_PAGE = 6;

	private final PatientsService patientsService;

	public PatientsController(PatientsService patientsService) {
		this.patientsService = patientsService;
	}

	@RequestMapping("/")
	public String index(Model model, @RequestParam(required = false, defaultValue = "0") Integer page) {
		if (page < 0) page = 0;

		long totalCount = patientsService.count();
		int start = page * ITEMS_PER_PAGE;
		long pageCount = (totalCount / ITEMS_PER_PAGE) +
				((totalCount % ITEMS_PER_PAGE > 0) ? 1 : 0);

		model.addAttribute("doctor", patientsService.listDoctor());
		model.addAttribute("patients",
				patientsService.listPatients(null, start, ITEMS_PER_PAGE));
		model.addAttribute("pages", pageCount);

		return "patients";
	}

	@RequestMapping("/create_patient")
	public String patientsAddPage(Model model) {
		model.addAttribute("doctor", patientsService.listDoctor());
		return "create_patients";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@RequestParam String pattern, Model model) {
		model.addAttribute("doctor", patientsService.listDoctor());
		model.addAttribute("patients", patientsService.searchPatients(pattern));
		return "patients";
	}

	@RequestMapping(value = "/patient/delete", method = RequestMethod.POST)
	public ResponseEntity<Void> delete(
			@RequestParam(value = "toDelete[]", required = false)
			long[] toDelete) {
		if (toDelete != null && toDelete.length > 0)
			patientsService.deletePatients(toDelete);

		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "/patients/add", method = RequestMethod.POST)
	public String patientsAdd(@RequestParam(value = "doctor") long doctorId,
							 @RequestParam String firstName,
							 @RequestParam String lastName,
							 @RequestParam String midlName,
							 @RequestParam String phone,
							 @RequestParam String pastConditions,
							 @RequestParam String relatedConditions,
							 @RequestParam String allergies,
							 @RequestParam String medications,
							 @RequestParam String complaints){
		Doctor doctor = (doctorId != DEFAULT_GROUP_ID) ?
				patientsService.findDoctor(doctorId) : null;

		Patients patients = new Patients(firstName, lastName,midlName, phone, pastConditions, relatedConditions,allergies,medications,complaints);
		patientsService.addPatients(patients);

		return "redirect:/";
	}
}
