package lesson2.examleTask;

public class Service {
    private String name;

    public Service(String name) {
        this.name = name;
    }

    public void readyForService(Contract contract, City city){
        int disForTo = contract.getHuman().getAuto().getToDistance();
        int afterTripDisance = contract.getHuman().getAuto().getCurrentDistance()+
                (city.getDistance()*2);
        if(afterTripDisance>=disForTo){
            System.out.println("Уважаемый "+contract.getHuman().getName()+".\n" +
                    "    Прежде чем вы направитесь в "+city.getName()+" " +
                    "вам понадобится пройти ТО.");
        }else {
            System.out.println("Уважаемый "+contract.getHuman().getName()+".\n" +
                    "    Езжайте в "+city.getName()+". Но не забывайте, что согласно\n" +
                    "    договору "+contract.getId()+" вы обслуживаетесь у нас.\n" +
                    "    Ваша "+name+".");
        }
    }
}
