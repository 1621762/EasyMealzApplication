package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ChickenActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Balsamic stuffed Chicken","1 teaspoon olive oil" +
                "1 shallot, finely diced" +
                "1 cup balsamic vinegar" +
                "2 skinless, boneless chicken breast halves" +
                "2 ounces goat cheese, divided","Method",
                "Step 1 - Preheat oven to 350 degrees F (175 degrees C).\n" +
                        "Step 2- Heat olive oil in a skillet over medium heat; cook and stir shallot until translucent, about 5 minutes. Pour balsamic vinegar into skillet and bring to a boil. Reduce heat to low and simmer until balsamic vinegar mixture is reduced by half, about 10 minutes. Stir often.\n" +
                        "Step 3- Cut chicken breasts from one side through the middle horizontally to within one-half inch of the other side. Open the two sides and spread them out like an open book.\n" +
                        "Step 4- Spread half the goat cheese onto one half of each chicken breast and drizzle 1/3 of the reduced balsamic vinegar mixture over the goat cheese. Close the chicken breasts over the goat cheese and secure with toothpicks. Arrange chicken into a baking dish. Drizzle with remaining 1/3 of the balsamic reduction.\n" +
                        "Step 5- Bake in the preheated oven until the chicken is no longer pink inside, the filling is hot, and the juices run clear, 30 to 35 minutes. An instant-read meat thermometer inserted into the center of a filled breast should read at least 160 degrees F (70 degrees C).\n" + "" +
                        "************NUTRITIONAL INTAKE*************\n" + "340 calories; protein 30.1g; carbohydrates 23.5g; fat 13.5g; cholesterol 83.2mg; sodium 229.5mg.\n ", R.drawable.balsamicstuffedchicken));

        recipes1.add(new Recipes("Baked Chicken","¼ cup butter, melted" +
                "1 teaspoon salt" + " 4 skinless, boneless chicken breast halves",
                "Method",
                "Step 1- Preheat oven to 350 degrees F (175 degrees C). Lightly butter a baking dish.\n" +
                        "Step 2- Stir 1/4 cup melted butter and salt together in a bowl.\n" +
                        "Step 3- Arrange chicken in the baking dish. Brush butter mixture onto the chicken until thoroughly coated, pouring any extra over the chicken.\n" +
                        "Step 4- Bake in the preheated oven until no longer pink in the center and the juices run clear, about 30 to 45 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" + "" +
                        "***********NUTRITIONAL INTAKE*************" + "Per Serving:\n" +
                        "228 calories; protein 30.5g; carbohydrates 11.4g; fat 6.5g; cholesterol 68.4mg; sodium 865.5mg.\n", R.drawable.bakedchicken));

        recipes1.add(new Recipes("Artichoke and sun-dried tomato chicken","4 skinless, boneless chicken breast halves \n" +
                "salt and pepper to taste \n" +
                "2 teaspoons olive oil \n" +
                "1 (14.5 ounce) can diced tomatoes with green peppers and onions \n" +
                "¼ cup sun-dried tomato pesto \n" +
                "1 (14 ounce) can artichoke hearts in water, drained and quartered\n","Method",
                "Step 1- Season both sides of chicken breasts with salt and pepper. Heat oil in a large skillet over medium-high heat. Place chicken in skillet; cook, turning once to brown each side. Remove chicken from pan and set aside.\n" +
                        "Step 2- Pour tomatoes into pan; cook for 1 minute, stirring constantly, and incorporating any brown bits from bottom of pan. Stir in pesto and artichokes and return chicken to pan. Cover, and reduce heat to medium. Simmer for 5 to 10 minutes, or until chicken is cooked through.\n" + "" +
                        "**********NUTRITIONAL INTAKE***********" + "Per Serving:\n" +
                        "228 calories; protein 30.5g; carbohydrates 11.4g; fat 6.5g; cholesterol 68.4mg; sodium 865.5mg.\n", R.drawable.artichokechicken));

        recipes1.add(new Recipes("Grilled Chicken with Rosemary and Bacon","4 teaspoons garlic powder \n" +
                "4 skinless, boneless chicken breast halves \n" +
                "salt and pepper to taste \n" +
                "4 sprigs fresh rosemary \n" +
                "4 thick slices bacon\n","Method",
                "Step 1- Preheat an outdoor grill for medium-high heat, and lightly oil the grate.\n" +
                        "Step 2- Sprinkle 1 teaspoon garlic powder on a chicken breast and season with salt and pepper. Lay one rosemary sprig on the chicken breast. Wrap the bacon around the chicken to hold the rosemary on. Secure the bacon with a toothpick or an additional thick rosemary stem.\n" +
                        "Step 3- Cook the chicken breasts until no longer pink in the center and the juices run clear, 8 minutes per side. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C). Stay near the grill to combat any flare ups from the bacon. Remove the toothpicks before serving.\n", R.drawable.grilledchickenwithrosemaryandbacon));

        recipes1.add(new Recipes("Cashew crusted Chicken","1 (12 ounce) jar apricot preserves \n" +
                "¼ cup prepared Dijon-style mustard \n" +
                "1 teaspoon curry powder \n" +
                "4 skinless, boneless chicken breast halves \n" +
                "1 cup coarsely chopped cashews\n","Method",
                "Step 1- Preheat oven to 375 degrees F (190 degrees C).\n" +
                        "Step 2- Combine the preserves, mustard and curry powder in a large skillet and heat over low heat, stirring constantly, until preserves are completely melted and smooth.\n" +
                        "Step 3- Place cashews in a shallow dish or bowl. Dip chicken breasts in skillet sauce, then roll in nuts to coat and place in a lightly greased 9x13 inch baking dish.\n" +
                        "Step 4- Bake at 375 degrees F (190 degrees C) for 20 to 30 minutes. Boil any remaining sauce and serve on the side with the baked chicken.\n" + "" +
                        "**********NUTRITIONAL INTAKE*************" + "Per Serving:\n" +
                        " 548 calories; protein 30.4g; carbohydrates 68.7g; fat 18.9g; cholesterol 67.2mg; sodium 686.5mg.\n" ,R.drawable.cashewcrustedchicken));

        recipes1.add(new Recipes("Pesto Cheesy Chicken Rolls","4 skinless, boneless chicken breast halves - pounded to 1/4 inch thickness \n" +
                "1 cup prepared basil pesto \n" +
                "4 thick slices mozzarella cheese \n" +
                "cooking spray\n","Method",
                "Step 1-Preheat the oven to 350 degrees F (175 degrees C). Spray a baking dish with cooking spray.\n" +
                        "Step 2-Spread 2 to 3 tablespoons of the pesto sauce onto each flattened chicken breast. Place one slice of cheese over the pesto. Roll up tightly, and secure with toothpicks. Place in a lightly greased baking dish.\n" +
                        "Step 3-Bake uncovered for 45 to 50 minutes in the preheated oven, until chicken is nicely browned, and juices run clear.\n" + "" +
                        "**********NUTRITIONAL INTAKE************" + "Per Serving:\n" +
                        " 585 calories; protein 49.5g; carbohydrates 5.6g; fat 40.3g; cholesterol 123.5mg; sodium 886.1mg. \n", R.drawable.pestocheesychickenrolls));

        recipes1.add(new Recipes("Buffalo Chicken Lettuce Wraps","2 pounds skinless, boneless chicken breasts \n" +
                "1 (12 ounce) bottle cayenne pepper sauce (such as Frank's® RedHot®) \n" +
                "1 (1 ounce) package ranch dressing mix \n" +
                "1 head Boston lettuce leaves\n","Method",
                "Step 1-Put chicken into the crock of a slow cooker.\n" +
                        "Step 2-Stir cayenne pepper sauce and ranch dressing mix together in a bowl until smooth; pour over chicken.\n" +
                        "Step 3-Cook on Low for 6 to 7 hours.\n" +
                        "Step 4-Transfer chicken to a large bowl and use 2 forks to shred chicken into strands.\n" +
                        "Step 5-Strain liquid from slow cooker crock into a bowl to serve on the side.\n" +
                        "Step 6-Spoon chicken into lettuce leaves and roll lettuce around chicken.\n" + "" +
                        "************NUTRITIONAL INTAKE************" + "Per Serving:\n" +
                        " 105 calories; protein 18g; carbohydrates 2.4g; fat 2g; cholesterol 46.8mg; sodium 1123.2mg\n", R.drawable.buffalochickenlettucewraps));

        recipes1.add(new Recipes("Chicken and Mushrooms","2 chicken breast halves, boneless, skin-on \n" +
                "salt and ground black pepper to taste \n" +
                "2 tablespoons olive oil \n" +
                "8 ounces fresh mushrooms, sliced 1/4 inch thick \n" +
                "1 pinch salt \n" +
                "½ cup water \n" +
                "1 tablespoon butter \n" +
                "salt and ground black pepper to taste\n","Method",
                "Step 1-Preheat oven to 400 degrees F (200 degrees C).\n" +
                        "Step 3-Season chicken on all sides with salt and ground black pepper.\n" +
                        "Step 3-Heat olive oil over medium-high heat in an ovenproof skillet. Place chicken skin-side down in skillet and cook until browned, about 5 minutes.\n" +
                        "Step 4-Turn chicken over; stir mushrooms with a pinch of salt into skillet. Increase heat to high; cook, stirring mushrooms occasionally, until mushrooms shrink slightly, about 5 minutes.\n" +
                        "Step 5-Transfer skillet to the preheated oven and cook until chicken is no longer pink in the center and the juices run clear, 15 to 20 minutes. An instant-read thermometer inserted into the center should read 165 degrees F (74 degrees C). Transfer chicken breasts to a plate and loosely tent with foil; set aside.\n" +
                        "Step 6-Set skillet on the stovetop over medium-high heat; cook and stir mushrooms until brown bits start to form on the bottom of the pan, about 5 minutes. Pour water into the skillet, and bring to a boil while scraping the browned bits off of the bottom of the pan. Cook until water is reduced by half, about 2 minutes. Remove from heat.\n" +
                        "Step 7-Stir in any accumulated juices from the chicken into the skillet. Stir butter into mushroom mixture, stirring constantly until butter is completely melted and incorporated.\n" +
                        "Step 8-Season with salt and pepper. Spoon mushroom sauce over chicken and serve.\n" + "" +
                        "************NUTRITIONAL INTAKE************" + "Per Serving:\n" +
                        " 398 calories; protein 28.1g; carbohydrates 3.7g; fat 30.6g; cholesterol 90.8mg; sodium 355.4mg.\n",R.drawable.chickenandmushrooms));

        recipes1.add(new Recipes("Chicken Walnut Cheese Wrapped in Bacon","2 boneless, skinless chicken breasts, halved horizontally \n" +
                "8 ounces crumbled blue cheese \n" +
                "6 ounces walnut halves \n" +
                "8 slices bacon\n","Method",
                "Step 1- Preheat oven to 350 degrees F (175 degrees C).\n" +
                        "Step 2- Pound chicken slices until they are even in thickness and about 1/4-inch thick. Spread blue cheese and walnuts on top of each chicken piece. Roll chicken breasts over filling.\n" +
                        "Step 3- Place 2 bacon slices side by side on a work surface. Place each chicken roll at one end of bacon slices and roll bacon around chicken; secure with toothpicks. Repeat with remaining chicken rolls and bacon.\n" +
                        "Step 4- Heat a skillet to medium-high heat and cook bacon-wrapped chicken rolls in the hot skillet until the bacon is browned and crisp, 4 to 5 minutes per side. Transfer chicken rolls to preheated oven; bake until chicken is no longer pink in the center and the juices run clear, 25 to 35 minutes.\n" +
                        "************NUTRITIONAL INTAKE***********" + "Per Serving:\n" +
                        " 637 calories; protein 36.8g; carbohydrates 7.4g; fat 52.8g; cholesterol 93mg; sodium 1238.3mg.\n",R.drawable.chickenwalnutcheesewrappedinbacon));

        recipes1.add(new Recipes("Crispy Baked Chicken with Giardiniera","4 (4 ounce) boneless, skinless chicken breasts \n" +
                "salt and freshly ground black pepper to taste \n" +
                "1 ½ cups butter and garlic croutons \n" +
                "½ cup all-purpose flour \n" +
                "2 large eggs, beaten \n" +
                "3 tablespoons olive oil \n" +
                "½ cup giardiniera \n" +
                "4 slices provolone cheese \n" +
                "2 tablespoons minced fresh parsley\n","Method",
                "Step 1- Preheat oven to 400 degrees F (200 degrees C).\n" +
                        "Step 2- Pound chicken breasts with a meat mallet to an even 1/4-inch to 1/2-inch thickness. Season with salt and pepper on both sides.\n" +
                        "Step 3- Pulse croutons in a small food processor until they have a fine consistency. Put flour, eggs, and crouton crumbs into 3 separate shallow dishes.\n" +
                        "Step 4- Dip each breast first into flour, shaking off the excess. Next, dip into egg mixture, letting any excess drip off. Coat chicken in crouton crumbs and set on a plate.\n" +
                        "Step 5- Heat oil over medium heat in a large oven-proof skillet until hot. Fry chicken for 2 minutes, flip, and fry an additional 2 minutes. Remove from heat. Top each breast with 2 tablespoons giardiniera and 1 slice of cheese.\n" +
                        "Step 6- Cook in the preheated oven until chicken is no longer pink in the center and the juices run clear, 8 to 10 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C). Top with parsley before serving.\n" + "" +
                        "************NUTRITIONAL INTAKE***********" + "Per Serving:\n" +
                        " 560 calories; protein 33.3g; carbohydrates 29.5g; fat 33.6g; cholesterol 177.2mg; sodium 706.8mg.\n", R.drawable.crispybakedchickenwithgiardiniera));



        myRV = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this,1));

        myRV.setAdapter(myAdapter);



    }

}