class Dominos
{
public static double takeOrder(String foodName)
{
if (foodName == "Marghertia")
{
	return 109.00;
}
if (foodName == "PeppyPanner")
{
	return 259.00;
}
if (foodName == "FarmHouse ")
{
	return 259.00;
}
if (foodName == "CheesenCorn ")
{
	return 209.00;
}
if (foodName == "Veg Extravaganza "){
	return 299.00;
}
if (foodName == "Maxican Green Wave"){
	return 259.00;
}
if (foodName == "Pepper Barbecue Chicken"){
	return 249.00;
}
if (foodName == "Chicken Keema Paraaatha Pizza"){
	return 249.00;
}
if (foodName == "Indi Chicken Tikka "){
	return 359.00;
}
if (foodName == "Spiced Double Chicken"){
	return 309.00;
}
if (foodName == "Chicken Dominator"){
	return 3559.00;
}
if (foodName == "Choco lava Cake"){
	return 109.00;
}
if (foodName == "Butterscotoch Mousse cake"){
	return 109.00;
}
if (foodName == "Red Velvet alva Cake"){
	return 139.00;
}
if (foodName == "Pepsi"){
	return 65.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}