create DATABASE storsge;
CREATE TABLE Suppliers (
  SupplierID INT PRIMARY KEY,
  CompanyName VARCHAR(50),
  Address VARCHAR(100),
  Phone VARCHAR(20),
  Email VARCHAR(50)
);

CREATE TABLE Staff (
  StaffID INT PRIMARY KEY,
  FullName VARCHAR(50),
  Position VARCHAR(50),
  Address VARCHAR(100),
  Phone VARCHAR(20),
  Email VARCHAR(50)
);

CREATE TABLE Customers (
  CustomerID INT PRIMARY KEY,
  CompanyName VARCHAR(50),
  Address VARCHAR(100),
  Phone VARCHAR(20),
  Email VARCHAR(50)
);

CREATE TABLE Products (
  ProductID INT PRIMARY KEY,
  ProductName VARCHAR(50),
  Description VARCHAR(200),
  Price DECIMAL(10, 2),
  QuantityInStock INT
);

CREATE TABLE Orders (
  OrderID INT PRIMARY KEY,
  CustomerID INT,
  OrderDate DATE,
  Total DECIMAL(10, 2),
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE OrderDetails (
  OrderDetailID INT PRIMARY KEY,
  OrderID INT,
  ProductID INT,
  Quantity INT,
  FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
  FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

CREATE TABLE Shipments (
  ShipmentID INT PRIMARY KEY,
  SupplierID INT,
  ShipmentDate DATE,
  Total DECIMAL(10, 2),
  FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);

CREATE TABLE ShipmentDetails (
  ShipmentDetailID INT PRIMARY KEY,
  ShipmentID INT,
  ProductID INT,
  Quantity INT,
  FOREIGN KEY (ShipmentID) REFERENCES Shipments(ShipmentID),
  FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

INSERT INTO Suppliers (SupplierID, CompanyName, Address, Phone, Email)
VALUES (1, 'ABC Supplies', ' Street, Anytown', '555441234', 'info@abc.com');

INSERT INTO Suppliers (SupplierID, CompanyName, Address, Phone, Email)
VALUES (2, 'XYZ Corporation', ' Park , Gotham ', '555335543678', 'sales@xyz.com');
