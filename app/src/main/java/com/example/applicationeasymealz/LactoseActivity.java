package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LactoseActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lactose);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken with Cauliflower and Olives","o\t1 pound boneless, skinless chicken breast\n" +
                "o\t1 bunch fresh thyme sprigs\n" +
                "o\t1 head cauliflower, cut into florets\n" +
                "o\t1 shallot, finely chopped\n" +
                "o\t3 tablespoons olive oil\n" +
                "o\t½ teaspoon celtic sea salt\n" +
                "o\t1 teaspoon ground black pepper\n" +
                "o\tzest of 1 lemon, use a microplane zester\n" +
                "o\t¼ cup fresh lemon juice\n" +
                "o\t1 cup kalamata olives, pitted\n" +
                "o\t5 cloves garlic, thinly sliced\n" +
                "\n","Method",
                "Rinse chicken breasts and pat dry with a paper towel\n" +
                        "Spread thyme sprigs evenly in the bottom of a 7 x 11 inch baking dish\n" +
                        "Place chicken over thyme sprigs and scatter cauliflower around chicken\n" +
                        "In a small bowl, combine shallot, olive oil, salt, pepper, lemon zest and juice, olives and garlic\n" +
                        "Pour mixture over chicken and cauliflower\n" +
                        "Refrigerate for at least one hour or overnight\n" +
                        "Bake at 400°F for 45-55 minutes, until chicken is cooked through and cauliflower is well browned\n" +
                        "Serve. \n" , R.drawable.chickenwithcauli));

        recipes1.add(new Recipes("Vegetarian Brown Rice Bowl","•\t2 tablespoons olive oil\n" +
                "•\t2 tablespoons of minced garlic\n" +
                "•\t2 large sweet potato, diced\n" +
                "•\t1 medium yellow onion, diced\n" +
                "•\t8 cups of broccoli florets, chopped\n" +
                "•\t1/8 teaspoon salt\n" +
                "•\t1/8 teaspoon pepper\n" +
                "For the Bowls\n" +
                "•\t1 cup short grain brown rice, uncooked\n" +
                "•\t2 cups water\n" +
                "•\t4 cups raw kale, deboned and chopped\n" +
                "•\t1 teaspoon olive oil\n" +
                "•\t1 cup roasted red pepper hummus\n" +
                "•\t1 cup sprouts\n" +
                "•\t1 tablespoon hemp hearts\n" +
                "•\t2 tablespoons tahini\n","Method",
                "1.\tFirst, preheat oven to 375ºF and spray a baking sheet with non-stick cooking spray.\n" +
                        "2.\tNext, prepare the rice by adding the rice and water to a small pot and bring to a boil over high heat.\n" +
                        "3.\tThen, turn heat to low cover pot, and let the rice simmer for about 30-40 minutes or until water has dissolved.\n" +
                        "4.\tNext, spread the sweet potato, onion, and broccoli evenly over the greased baking sheet. Toss in olive oil and garlic.\n" +
                        "5.\tSprinkle salt and pepper over the vegetables and then place into the oven and roast for 25-30 minutes at 375ºF, tossing halfway.\n" +
                        "6.\tPrepare the kale by placing kale into a bowl and drizzling with about 1 teaspoon of olive oil.\n" +
                        "7.\tMassage the kale with hands until the kale breaks down by about half. Set kale aside.\n" +
                        "8.\tRemove rice from the stove top when finished and fluff with a fork. Set aside.\n" +
                        "9.\tRemove vegetables from the oven. Set aside.\n" +
                        "10.\t Assemble bowls by evenly distributing rice, vegetables, kale, sprouts, hummus, hemp seeds, and tahini between four bowls or meal prep containers* and enjoy!\n" + "************NUTRITIONAL INTAKE***********" + "Serving Size: 1/4 recipe Calories: 519 Sugar: 11 Sodium: 352 Fat: 23 Carbohydrates: 76 Fibre: 13 Protein: 19 Cholesterol: 0", R.drawable.vegetarianbrownricebowl));

        recipes1.add(new Recipes("Pineapple Fried Rice","•\t1 tablespoon coconut oil\n" +
                "•\t2 link chicken apple sausage\n" +
                "•\t1 medium bell pepper, red\n" +
                "•\t2 medium carrot\n" +
                "•\t2 stalk green onion\n" +
                "•\t2 cup cooked brown rice\n" +
                "•\t1 cup pineapple\n" +
                "•\t3 tablespoon cilantro\n" +
                "•\t2 tablespoon soy sauce, low sodium\n" +
                "•\t1 teaspoon lime juice\n" +
                "•\t1 teaspoon sugar\n","Method",
                "1.\tIn a large saute pan or wok, heat coconut oil over medium-high heat.\n" +
                        "2.\tAdd diced sausage (if using). Cook until it’s starting to brown, about 3-4 minutes.\n" +
                        "3.\tAdd chopped bell pepper and peeled and chopped carrots. Cook about 5 minutes until tender-crisp.\n" +
                        "4.\tIn a small bowl , stir together soy sauce, sugar, and lime juice.\n" +
                        "5.\tTo the pan, add cooked rice, chopped pineapple, chopped cilantro, scallions, and soy sauce mixture. Stir to combine.\n" + "**************NUTRITIONAL INTAKE***********" + "Calories: 345kcal | Carbohydrates: 57g | Protein: 10g | Fat: 8g | Sodium: 360mg | Fiber: 4g | Sugar: 5g", R.drawable.pineapplefriedrice));

        recipes1.add(new Recipes("Vegan Pizza","•\t1 ball dough \n" +
                "•\t1 jarred roasted red pepper\n" +
                "•\t3 cloves garlic\n" +
                "•\t8 baby bella mushrooms\n" +
                "•\t¼ red onion\n" +
                "•\t½ cup cooked chickpeas\n" +
                "•\t2 tablespoons olive oil, plus more for brushing dough\n" +
                "•\t3 cups spinach, packed\n" +
                "•\t½ teaspoon kosher salt \n" +
                "•\t¾ cup Muir Glen Organic fire roasted crushed tomatoes  \n" +
                "•\t6 canned artichoke heart quarters\n" +
                "•\t4 large leaves basil\n","Method",
                "1.\tPlace a pizza stone in the oven and preheat to 500°F. OR preheat your pizza oven.  \n" +
                        "2.\tPrepare the toppings: Slice the jarred red pepper into thin strips and set aside. Mince 3 cloves garlic. Slice the mushrooms and red onion. Drain and rinse the chickpeas. In a large skillet, heat 2 tablespoons olive oil. Add the garlic, mushrooms, onion, chickpeas, and spinach and ½ teaspoon kosher salt; saute until the mushrooms are tender and the spinach is wilted, about 5 minutes.\n" +
                        "3.\tWhen the oven is ready, dust a pizza peel with cornmeal or semolina flour. (If you don’t have a pizza peel, you can use a rimless baking sheet or the back of a rimmed baking sheet. But a pizza peel is well worth the investment!) Stretch the dough into a circle; see How to Stretch Pizza Dough for instructions. Then gently place the dough onto the pizza peel. \n" +
                        "4.\tQuickly assemble the pizza: Spread a thin layer of crushed tomatoes across the dough and sprinkle with a few pinches kosher salt. Add the sauteed vegetables, then top with red pepper strips and artichoke quarters. \n" +
                        "5.\tTransfer the pizza to the oven on the pizza peel, and bake until the crust is browned, about 5 to 7 minutes. While the pizza bakes, cut the basil into thin strips (chiffonade). Allow to cool slightly, then top with basil and serve.\n" + "***********NUTRITIONAL INTAKE************" + "Total Fat 7.6g, Total Carbohydrate 35.8g, Dietary Fibre 6.7g, Sugars 3.3g, Protein 9.7g, Vitamin A 92.2µg, Vitamin C 24.6mg, Calcium 44.6mg, Iron 2.6mg, Vitamin D 0.4µg, Magnesium 81.6mg, Potassium 631.6mg, Vitamin B6 0.5mg, Vitamin B12 0µg. ", R.drawable.veganpizza));

        recipes1.add(new Recipes("Creamy Butternut Squash Linguine with Fried Sage ","•\t2 tablespoons olive oil\n" +
                "•\t1 tablespoon finely chopped fresh sage\n" +
                "•\t2 pound butternut or kabocha squash, peeled, seeded, and cut into small ½-inch pieces (about 3 cups)\n" +
                "•\t1 medium yellow onion, chopped\n" +
                "•\t2 garlic cloves, pressed or chopped\n" +
                "•\t⅛ teaspoon red pepper flakes (up to ¼ teaspoon for spicier pasta sauce)\n" +
                "•\tSalt\n" +
                "•\tFreshly ground black pepper\n" +
                "•\t2 cups vegetable broth\n" +
                "•\t12 ounces whole grain linguine or fettucine\n" +
                "•\tOptional additional garnishes: shaved Parmesan or Pecorino and/or smoked salt\n","Method",
                "1.\tWarm the oil in a large skillet over medium heat. Once the oil is shimmering, add the sage and toss to coat. Let the sage get crispy before transferring it to a small bowl. Sprinkle it lightly with salt and set the bowl aside.\n" +
                        "2.\tAdd the squash, onion, garlic and red pepper flakes to the skillet. Season with salt and pepper. Cook, stirring occasionally, until the onion is translucent, about 8 to 10 minutes. Add the broth. Bring the mixture to a boil, then reduce the heat and simmer until the squash is soft and the liquid is reduced by half, about 15 to 20 minutes.\n" +
                        "3.\tIn the meantime, bring a large pot of salted water to a boil and cook the pasta until al dente according to package directions, stirring occasionally. Reserve 1 cup of the pasta cooking water before draining.\n" +
                        "4.\tOnce the squash mixture is done cooking, remove it from the heat and let it cool slightly. Transfer the contents of the pan to a blender, but keep the skillet handy. Purée the mixture until smooth (beware of hot steam escaping from the top of the blender), then season with salt and pepper until the flavours sing.\n" +
                        "5.\tIn the reserved skillet, combine the pasta, squash purée and ¼ cup cooking liquid. Cook over medium heat, tossing and adding more pasta cooking water as needed, until the sauce coats the pasta, about 2 minutes. Season with more salt and pepper if necessary.\n" +
                        "6.\tServe the pasta in individual bowls topped with fried sage, more black pepper and shaved Parmesan/Pecorino and/or smoked salt, if desired.\n", R.drawable.creamybutternutsquashlinguine));

        recipes1.add(new Recipes("Coconut Lime Panko Crusted Cod","1 1/2 lb cod loin\n" +
                "1 lime, zested and juiced\n" +
                "1/2 cup panko bread crumbs\n" +
                "1/2 cup flaked coconut (I used sweetened, but unsweetened would certainly work here too)\n" +
                "salt and pepper to taste\n" +
                "Preheat your oven to 425°F, and spray a cookie sheet with non-stick spray.\n","Method",
                "In a shallow bowl, add your lime juice. To another shallow bowl or plate, add your panko, coconut, lime zest, and salt and pepper to your liking. Run your loins first through the juice, then press into the panko mixture. Really pat the panko into the fish to help it stick. Put your coated fish on the cookie sheet, and bake for about 10-20 minutes depending on the thickness of your filets. Mine were 3/4 lb each and about 1 and 1/4 inch thick, so they took about 20 minutes. You’ll know they’re done when they flake easily with a fork or you notice they’re starting to come apart.\n" +
                        "Note: Coconut oil can be used in place of the lime juice in this. I actually prefer it with the coconut oil for even more of that tropical, coconut flavor and healthy fats.\n" +
                        "\n", R.drawable.coconutlimepanko));

        recipes1.add(new Recipes("Shrimp and Avocado Taco Salad","•\t1/3 cup packed cilantro leaves, roughly chopped\n" +
                "•\t1/4 cup fresh lime juice\n" +
                "•\t1/4 cup extra virgin olive oil\n" +
                "•\t1 Tablespoon honey\n" +
                "•\t1/2 teaspoon chili powder\n" +
                "•\tsalt and pepper\n" +
                "•\t1/2lb jumbo shrimp, peeled and deveined\n" +
                "•\t10oz chopped romaine lettuce\n" +
                "•\t1/2 cup shredded red cabbage\n" +
                "•\t1/2 cup grape or cherry tomatoes, halved\n" +
                "•\t1 avocado, chopped\n" +
                "•\tcoarse sea salt (optional)\n" +
                "•\tblue corn tortilla chips, crushed\n","Method",
                "1.\tCombine the first six ingredients in a food processor or blender then process until smooth. Place shrimp in a plastic bag then add 3 Tablespoons of the dressing and marinate in the refrigerator for 10 minutes (no longer.) Reserve remaining dressing for salad dressing.\n" +
                        "2.\tAfter the shrimp have marinated, spray the bottom of a skillet with extra virgin olive oil or non-stick spray then sauté in two batches to avoid overcrowding the pan, for 1-2 minutes a side, or until just barely cooked through. Set aside to cool slightly. Discard remaining marinade.\n" +
                        "3.\tDivide lettuce and red cabbage between plates then top with avocados, tomatoes, sauteed shrimp, and crushed tortilla chips. Sprinkle with sea salt, if desired, then drizzle dressing on top and serve.\n", R.drawable.shrimpandavocadotacosalad));

        recipes1.add(new Recipes("Beef Stroganoff",".5 pounds sirloin steak\n" +
                "•\t1 onion chopped\n" +
                "•\t6 ounces white button mushrooms sliced\n" +
                "•\t2 Tablespoons gluten free flour blend\n" +
                "•\t2 teaspoons gluten free Worcestershire sauce\n" +
                "•\t1/4 teaspoon salt\n" +
                "•\t1/8 teaspoon pepper\n" +
                "•\t1 1/2 cups non-dairy milk\n" +
                "•\t12 ounces gluten free pasta cooked according to package directions\n" +
                "•\tchives optional\n","Method",
                "1.\tSlice the sirloin steak super thin and saute with the onions and mushrooms in a large skillet.\n" +
                        "2.\tOnce the steak is cooked through, remove the steak and vegetables to a bowl while you make the sauce in the skillet.\n" +
                        "3.\tAdd the gluten free flour to the pan drippings and stir. Slowly add the non-dairy milk and whisk to thicken.\n" +
                        "4.\tAdd the salt and pepper and Worcestershire sauce. Stir, then add the beef and vegetables, and heat through.\n" +
                        "5.\tServe over pasta and top with chives if desired.\n" + "***********NUTRITIONAL INTAKE************" + "at 9g14%\n" +
                        "Saturated Fat 2g13%\n" +
                        "Cholesterol 83mg28%\n" +
                        "Sodium 354mg15%\n" +
                        "Potassium 624mg18%\n" +
                        "Carbohydrates 55g18%\n" +
                        "Fibre 2g8%\n" +
                        "Sugar 2g2%\n" +
                        "Protein 37g74%\n" +
                        "Vitamin C 2.6mg3%\n" +
                        "Calcium 136mg14%\n" +
                        "Iron 3.5mg19%\n",R.drawable.beefstrog));

        recipes1.add(new Recipes("Crock Pot Carne Asada","•\t2 lb chuck roast\n" +
                "•\tjuice of 1 orange\n" +
                "•\tjuice of 2 limes\n" +
                "•\t1/4 cup extra virgin olive oil\n" +
                "•\t¼ cup fresh minced cilantro\n" +
                "•\t1 tsp red pepper flakes\n" +
                "•\t4 cloves garlic, minced\n" +
                "•\t1 tsp coconut sugar (optional)\n" +
                "•\t½ tsp coriander\n" +
                "•\t2 tsp oregano\n" +
                "•\t¼ tsp cumin\n" +
                "•\t2 tsp sea salt\n" +
                "•\t1 large shallot, chopped\n" +
                "\n","Method",
                "1.\tRinse chuck roast under cold water and pat dry. Set aside and let stand for 30 minutes.\n" +
                        "2.\tPlace all remaining ingredients in a food processor and pulse to combine.\n" +
                        "3.\tPlace chuck roast in a crock pot and liberally coat with asada marinade.\n" +
                        "4.\tAdd ¼ cup of filtered water to crock pot (this allows the meat to heat up evenly rather than scorching it in the crock pot) and cook for 5 hours on HIGH, turning meat over every hour\n" +
                        "5.\tRemove chuck from crock pot and let it rest about 20 minutes.\n" +
                        "6.\tSlice meat across the grain and spoon over the juices from crock pot.\n" +
                        "7.\tEnjoy!\n", R.drawable.crockpotcarne));

        recipes1.add(new Recipes("Harvest Frittata","•\t6-8 large local farm fresh brown eggs (more eggs will give you a fluffier thicker frittata, less eggs and it will be thinner)\n" +
                "•\t1/8 teaspoon red pepper flakes (optional)\n" +
                "•\t1/4 cup fresh basil, roughly chopped\n" +
                "•\t1 tablespoon olive oil\n" +
                "•\t1/2 cup celery, chopped\n" +
                "•\t1 small red onion, chopped\n" +
                "•\t2 cloves garlic, minced\n" +
                "•\t1 medium zucchini, cut in half-length wise, then cut in half again (if it is large enough) and sliced\n" +
                "•\t1 medium yellow squash, cut in half length wise, then cut in half again (if it is large enough) and sliced\n" +
                "•\t1 cup grape tomatoes, halved or quartered depending on what size they are\n" +
                "•\tSalt and pepper to taste\n","Method",
                "Preheat the oven to 400ºF.\n" +
                        "In a medium bowl, whisk the eggs with a small pinch of salt, red pepper flakes and basil. Set aside.\n" +
                        "In a 8 to 9 inch oven-safe, cast iron skillet, heat olive oil over a medium-high heat, make sure you get the olive oil all up the sides using a brush or some wax paper, etc. (you can also use an oven-safe non-stick skillet). Add the onion and celery, with a dash of sea salt, sauté about 3-5 minutes until the onion is translucent. Add the garlic and sauté another 2 minutes, being careful not to burn it. Add the zucchini and squash, toss around and sauté about 8-10 minutes, until they are tender. Add the tomatoes and cook for another 2-3 minutes until the tomatoes start to soften and get tender. If there is any water sitting in the pan from the veggies, pour it off. Salt and pepper to taste.\n" +
                        "\n" +
                        "Turn down the heat a bit. Add the egg mixture to the skillet by pouring over the veggies and giving it all a really quick stir to combine. Cook over a medium-low heat for about 5 minutes or until the eggs are just set and there isn’t a lot of liquid running around the pan. To do this, run a spatula underneath the sides of the frittata and tilt the pan so the uncooked eggs run to the underside and cook.\n" +
                        "Place the skillet in the centre of your preheated oven. Allow to bake for 13-15 minutes, until it is golden brown, well set and puffy. Remove from oven with oven mitts and let cool for several minutes, cut into wedges and serve\n", R.drawable.harvestfrittata));

        recipes1.add(new Recipes("Creamy Garlic Pasta with Roasted Tomatoes","•\t3 cups grape tomatoes (halved)\n" +
                "•\t10 ounces whole wheat pasta (such as penne, linguini, or fettuccine // use less if you want a higher sauce:pasta ratio // use gluten-free pasta for GF eaters)\n" +
                "•\tOlive oil\n" +
                "•\t2 medium shallots (diced // 2 medium shallots yield ~1/4 cup or 40 g)\n" +
                "•\t8 large cloves garlic (minced/grated // 8 large cloves yield ~1/4 cup or 24 g)\n" +
                "•\t1 pinch each sea salt and black pepper\n" +
                "•\t3-4 Tbsp unbleached all-purpose flour (or another thickener of choice)*\n" +
                "•\t2 1/2 cups unsweetened plain Almond Breeze\n" +
                "•\t2-3 Tbsp nutritional yeast\n" +
                "•\t1-2 Tbsp vegan parmesan cheese (optional // plus more for serving)\n" +
                "•\t1-2 Tbsp lemon juice (optional)\n","Method",
                "1.\tPreheat oven to 400 degrees F (204 C) and toss tomatoes in a bit of olive oil and sea salt. Place cut side up on a parchment-lined baking sheet and bake for 20 minutes while you prepare the rest of the dish. Then set aside.\n" +
                        "2.\tBring a large pot of water to a boil and cook pasta according to package instructions. When done, drain, cover and set aside.\n" +
                        "3.\tIn the meantime, prepare the sauce. In a large skillet over medium-low heat, add 1 Tbsp (15 ml // use more, as needed, if increasing batch size) olive oil and the garlic and shallot. Add a pinch of salt and black pepper and stir frequently, cooking for 3-4 minutes until softened and fragrant.\n" +
                        "4.\tStir in flour (or other thickener of choice – see notes) and mix with a whisk. Once combined, slowly whisk in the almond milk a little at a time so clumps don’t form. Then add nutritional yeast, another healthy pinch of salt and black pepper, and bring to a simmer. Continue cooking for another 4-5 minutes to thicken. \n" +
                        "5.\tTaste and adjust seasonings as needed, adding more salt to taste, more minced/pressed garlic for zing, or more nutritional yeast for cheesy flavour. \n" +
                        "Optional: You can also add 1-2 Tbsp of vegan parmesan for extra flavour at this time. Some readers also enjoyed adding 1-2 Tbsp fresh lemon juice at this time for some brightness / acidity.)\n" +
                        "6.\tIf you want an ultra-creamy sauce, transfer sauce to a blender (or use an immersion blender) to blend the sauce until creamy and smooth. Place back in pan and reduce heat to a low simmer until desired thickness is reached.\n" +
                        "7.\tOnce the sauce is to your desired thickness, taste and adjust seasonings as needed. Then add pasta and roasted tomatoes and stir.\n" +
                        "8.\tServe immediately and garnish with extra black pepper, fresh basil, and/or vegan parmesan cheese. Best when fresh, but will keep for up to 2 days in fridge.\n" + "*************NUTRITIONAL INTAKE*************" + "Serving: 1 serving Calories: 379Carbohydrates: 64 g Protein: 11.5 g Fat: 9 g Saturated Fat: 0.8 g Trans Fat: 0 g Cholesterol: 0 mg Sodium: 360 mg Fibre: 8.5 g Sugar: 5 g", R.drawable.creamyvegangarlicpasta));



        myRV = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this,1));

        myRV.setAdapter(myAdapter);



    }

}