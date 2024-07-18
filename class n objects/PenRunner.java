class PenRunner
{
      public static void main(String[] factory)
    {
      Pen ref =  new Pen();
	  ref.name = "Reynolds";
	  ref.id = 1;
	  ref.color = "bule";
	  ref.price = 20.00;
	  
	  System.out.println("The Brand name is:" +ref.name);
	  System.out.println("The pen id  is:" +ref.id);
	  System.out.println("The Pen color is:" +ref.color);
	  System.out.println("The pen price is:" +ref.price);	
	  
	  Pen ref1 =  new Pen();
	  ref1.name = "Parker";
	  ref1.id = 2;
	  ref1.color = "Black";
	  ref1.price = 250.00;
 }
    }