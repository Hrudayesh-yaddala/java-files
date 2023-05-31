package oops;
class volume
{
	int width;
	int height;
	int depth;
	volume(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	void result()
	{
		System.out.println("volume :"+(width*height*depth)+" "+n);
	}
}
public class box_volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		volume v=new volume(4,7,8);
		v.result();

	}

}
