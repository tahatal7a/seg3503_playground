import java.util.LinkedList;

public class DateNextDateOkTest
{
List<Date[]> params = new LinkedList<Date[]>();
params.add(new Date[]{new Date(1700,5,20), new Date(1700,5,21)});
params.add(new Date[]{new Date(2005,3,15), new Date(2005,3,16)});
params.add(new Date[]{new Date(1901,6,20), new Date(1901,6,21)});
params.add(new Date[]{new Date(3456,2,27), new Date(3456,2,28)});
params.add(new Date[]{new Date(1500,1,17), new Date(1500,1,18)});
params.add(new Date[]{new Date(1700,5,29), new Date(1700,5,30)});
params.add(new Date[]{new Date(1800,10,29), new Date(1800,10,30)});
params.add(new Date[]{new Date(3453,0,29), new Date(3453,0,30)});
params.add(new Date[]{new Date(444,1,29), new Date(444,2,1)});
params.add(new Date[]{new Date(2005,3,30), new Date(2005,4,1)});
params.add(new Date[]{new Date(3453,0,30), new Date(3453,0,31)});
params.add(new Date[]{new Date(3456,2,30), new Date(3456,2,31)});
params.add(new Date[]{new Date(1901,6,31), new Date(1901,7,1)});
params.add(new Date[]{new Date(3453,0,31), new Date(3453,1,1)});
params.add(new Date[]{new Date(3456,11,31), new Date(3457,0,1)});
return params;

}