class Zepto{
public static double takeOrder(String foodName){
if (foodName == "Homemade ChocolateCake"){
	return 99.00;
}
if (foodName == "Blueberry Oatmeal cake"){
	return 104.00;
}
if (foodName == "Masala Lemonade"){
	return 160.00;
}
if (foodName == "Mint Chaas"){
	return 126.00;
}
if (foodName == "Peri Peri Potato Wedges"){
	return 120.00;
}
if (foodName == "Chessy Wedges"){
	return 220.00;
}
if (foodName == "Magic Masala Wedges"){
	return 180.00;
}
if (foodName == "Tadka Crouton Nachos"){
	return 200.00;
}
if (foodName == "Mexican Potato Nachos"){
	return 190.00;
}
if (foodName == "ToKyo Tossed Veggle"){
	return 130.00;
}
if (foodName == "Schezwan Corn Nuggets"){
	return 108.00;
}
if (foodName == "Thai Fried Strips"){
	return 145.00;
}
if (foodName == "Veggle in Chill Garlic Sauce"){
	return 179.00;
}
if (foodName == "Chilli Paneer"){
	return 120.00;
}
if (foodName == "BBQ Chicken SandWich"){
	return 195.00;
}
else{
	System.out.println(foodName+"NOt Found");
}
return 0.0;
}
}