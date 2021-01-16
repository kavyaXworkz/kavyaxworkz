class TrainTester
{
public static void main(String a[])
{
TrainDTO trn=new TrainDTO();
trn.setName("dadar");
trn.setNumber(13);
System.out.println(trn.getName()+ " "+trn.getNumber()+ " "+TrainDTO.station);

TrainDTO trn1=new TrainDTO();
trn1.setName("dadar12");
trn1.setNumber(23);
System.out.println(trn1.getName()+ " "+trn1.getNumber()+ " "+TrainDTO.station);
}
}
