class FiveStarChicken
{
public static double takeOrder(String foodName)
{
if (foodName == "prawn fry"){
	return 200.00;
}
if (foodName == "Egg omlet"){
	return 124.00;
}
if (foodName == " Dhum Briyani"){
	return 170.00;
}
if (foodName == "Tandoori Chicken"){
	return 126.00;
}
if (foodName == "Chicken Roast"){
	return 100.00;
}
if (foodName == "Egg cury"){
	return 220.00;
}
if (foodName == "Mutton cury"){
	return 180.00;
}
if (foodName == "Chicken Tikka"){
	return 200.00;
}
if (foodName == "Fish Tikka"){
	return 140.00;
}
if (foodName == "Masala omelette"){
	return 130.00;
}
if (foodName == "Chicken Keema"){
	return 108.00;
}
if (foodName == "Mutton Keema"){
	return 145.00;
}
if (foodName == "Mutton Masala"){
	return 179.00;
}
if (foodName == "Lemon Chicken"){
	return 120.00;
}
if (foodName == "Chicken Manchurian"){
	return 195.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}