package org.example;


@Configuration
public class Config {

    @Bean
    public AudioSystem sonyAudio(){
        return new Sony();
    }
    @Bean
    public NavigationSystem navitelNav(){
        return new Navitel();
    }

    @Bean
    public Audi car(@Qualifier("sonyAudio") AudioSystem audioSystem, @Qualifier("navitelNav") NavigationSystem navigationSystem){
        return new Audi(audioSystem,navigationSystem);
    }

    @Bean
    public Kia car2(){
        return new Kia();
    }
}
