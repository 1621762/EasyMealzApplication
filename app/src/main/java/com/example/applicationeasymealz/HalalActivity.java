package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HalalActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halal);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Fajitas","50g coriander leaves\n" +
                "60ml lime juice\n" +
                "60ml chicken stock\n" +
                "3 spring onions, cut into 1-inch pieces\n" +
                "2 cloves garlic\n" +
                "1 jalapeno, seeded if desired\n" +
                "1 tablespoon honey\n" +
                "Salt\n" +
                "675g boneless skinless chicken breasts\n" +
                "1 red onion, sliced into 1/2-inch thick rounds\n" +
                "2 orange and/or yellow peppers, quartered, seeds removed\n" +
                "1 ripe avocado, halved, seeded and peeled\n" +
                "1 1/2 teaspoons olive oil\n" +
                "1/8 teaspoon ground cumin\n" +
                "1/8 teaspoon ground coriander\n" +
                "1/4 cup fat-free Greek Yogurt\n" +
                "12 corn tortillas\n","Method",
                " 1. Put the coriander, lime juice, broth, spring onions, garlic, jalapeno, honey, and salt in a blender, puree until smooth. Reserve 2 tablespoons; do not wash out the blender.\n" +
                        "2. Put chicken breasts in a medium bowl and the peppers and onions in another. Divide the remaining coriander puree evenly between the chicken and the peppers and onions. Toss well to coat the chicken and vegetables and let stand, at room temperature, for up to 30 minutes.\n" +
                        "3. Add the avocado, 120ml water, and the reserved 2 tablespoons coriander sauce to the blender. Puree until smooth and season with salt. Set aside.\n" +
                        "4. Heat the oil in a small frying pan set over medium heat until hot. Add the cumin and coriander and continue to cook until fragrant, about 30 seconds to 1 minute. Pour the spices over the yogurt and set aside for the flavors to blend. Stir before serving.\n" +
                        "5. Preheat a grill for medium-high/direct heat cooking. Oil the grill grates. Grill the chicken and vegetables, turning, until the vegetables are tender and the chicken reaches an internal temperature of 71°C, about 5 to 8 minutes for the vegetables and 12 to 15 minutes for the chicken. Let chicken rest 5 minutes. Place the tortillas on the grill until just warmed through, about 30 seconds.\n" +
                        "6. To assemble the fajitas: slice the onions and peppers into thin strips and then slice the chicken. Place some peppers, onions, chicken and coriander in a tortilla topped with the spiced yogurt and the avocado sauce.\n", R.drawable.chickenfajitas));

        recipes1.add(new Recipes("Mexican Quinoa Stuffed Peppers","1 cup quinoa or rice (thoroughly rinsed and drained)\n" +
                "2 scant cups vegetable stock (sub water, but it will be less flavorful)\n" +
                "4 large red, yellow, or orange bell peppers (halved, seeds removed)\n" +
                "1/2 cup salsa (plus more for serving)\n" +
                "1 Tbsp nutritional yeast (optional)\n" +
                "2 tsp cumin powder\n" +
                "1 1/2 tsp chili powder\n" +
                "1 1/2 tsp garlic powder\n" +
                "1 15-ounce can black beans (drained // if unsalted, add 1/4 tsp sea salt per can)\n" +
                "1 cup whole kernel corn (drained)\n" +
                "1 ripe avocado (sliced)\n" +
                "Fresh lime juice\n" +
                "Hot sauce\n" +
                "Cilantro (chopped)\n" +
                "Diced red onion\n" +
                "Creamy Cilantro Dressing\n" +
                "Chipotle Red Salsa (or your favorite salsa)\n","Method",
                "1.Add quinoa and vegetable stock to a saucepan and bring to a boil over high heat. Once boiling, reduce heat, cover, and simmer until all liquid is absorbed and quinoa is fluffy – about 20 minutes.\n" +
                        "2.Preheat oven to 375 degrees F (190 C) and lightly grease a 9×13 baking dish or rimmed baking sheet.\n" +
                        "3.Brush halved peppers with a neutral, high heat oil, such as avocado oil or refined coconut oil.\n" +
                        "4.Add cooked quinoa to a large mixing bowl and add remaining ingredients – salsa through corn. Mix to thoroughly combine then taste and adjust seasonings accordingly, adding salt, pepper, or more spices as desired.\n" +
                        "5.Generously stuff halved peppers with quinoa mixture until all peppers are full, then cover the dish with foil.\n" +
                        "6.Bake for 30 minutes covered. Then remove foil, increase heat to 400 degrees F (204 C), and bake for another 15-20 minutes, or until peppers are soft and slightly golden brown. For softer peppers, bake 5-10 minutes more.\n" +
                        "7.Serve with desired toppings (listed above) or as is. Best when fresh, though leftovers keep covered in the refrigerator for 2-3 days. Reheat in a 350-degree F (176 C) oven until warmed through – about 20 minutes.\n", R.drawable.mexicanquinoastuffedpeppers));

        recipes1.add(new Recipes("Roasted Chicken with Lemon and Garlic","lemon\n" +
                "1\n" +
                "head of garlic\n" +
                "¼\n" +
                "cup (½ stick) unsalted butter or extra-virgin olive oil\n" +
                "1\n" +
                "3½–4 lb. whole chicken\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n","Method",
                "Arrange a rack in the center of your oven, and preheat to 425°. Cut 1 lemon in half crosswise and remove any visible seeds.\n" +
                        "\n" +
                        "Cut 1 head of garlic in half crosswise. (If it falls apart a bit, don't sweat it.)\n" +
                        "\n" +
                        "Melt ½ stick butter in a small saucepan or microwave in a small bowl.\n" +
                        "\n" +
                        "Place 1 3–4-lb. whole chicken on a cutting board (best to use a plastic one you can sterilize). A word on bird size. A 3–4-lb. chicken is pretty much the ideal size for roasting this way. Something a little bit bigger will work, but once you get much past 4½-lbs. it becomes harder to guarantee that the breast meat won't dry out in the time it takes the dark meat to cook. Pat the whole thing dry with paper towels. It's super important to get the chicken as dry as possible, which helps with browning.\n" +
                        "\n" +
                        "With chicken breast facing up and legs pointing toward you, use a sharp knife to slice through loose area of skin connecting the leg and breast, making about a 3\"-long incision. Continue cutting downward until you hit the joint that connects the thigh to the body, then stop (once you get through the skin, there’s not much there; if you are cutting through flesh, you’re too close to the breast). This exposes the leg joint, making it easy to tell if chicken is cooked. Repeat on second side.\n" +
                        "\n" +
                        "Season every surface of chicken, including skin along backbone, inside cavity, under wings, and inside part of the leg you just exposed, with lots of salt and pepper. If you’re using kosher salt, it should take you 4–5 generous—as in, four finger—pinches, which will be around 4 whole teaspoons.\n" +
                        "\n" +
                        "Transfer chicken breast side up to a large oven-safe skillet. Arrange lemon and garlic cut sides down in skillet around chicken.\n" +
                        "\n" +
                        "Drizzle chicken all over with melted butter and transfer to oven.\n" +
                        "\n" +
                        "Roast until chicken is nicely browned and cooked through, checking for doneness after 45 minutes. To check, carefully remove skillet from oven (the handle is hot!), poke a knife into leg joints, and pierce the meat. If juices run clear, the chicken is done. If you see a rosy pink color, it needs more time. Continue to roast, checking every 5 minutes, until juices run clear. (If you’re not sure, you can also use the knife to lightly shred some of the meat along the thigh bone—the meat should look opaque and the fibers should separate easily.)\n" +
                        "\n" +
                        "Let chicken rest in skillet at least 15 minutes before carving—this will help the juices in the meat to settle, and will also get it down to a temperature that is cool enough to handle with your bare hands while carving. Don't worry: It's a big piece of meat, so it will still be plenty warm by the time you serve it. Transfer chicken to a platter. Pour all of those glorious, buttery pan juices over top of the meat and serve with roasted lemon and garlic alongside. Winner, winner, chicken dinner!\n" +
                        "\n" +
                        "Do Ahead: Chicken can be made 2 days ahead. Let cool. Cover and chill; bring to room temperature before serving.\n", R.drawable.roastedchickenwithlemonandgarlic));

        recipes1.add(new Recipes("Baked Salmon","2 pound side of salmon boneless (skin on or off, depending upon your preference), wild caught if possible\n" +
                "5 sprigs fresh rosemary or fresh herbs of your choice; do not use dried herbs\n" +
                "2 small lemons divided, plus extra for serving as desired\n" +
                "2 tablespoons extra virgin olive oil\n" +
                "1 teaspoon kosher salt\n" +
                "1/4 teaspoon ground black pepper\n" +
                "4 cloves garlic peeled and roughly chopped\n" +
                "Additional chopped fresh herbs such as basil, thyme, parsley, dill, or green onion (optional)\n","Method",
                "1- Remove the salmon from the refrigerator and let stand at room temperature for 10 minutes while you prepare the other ingredients. Heat oven to 375 degrees F. Line a large baking dish or rimmed baking sheet with a large piece of aluminum foil.\n" +
                        "2- Lightly coat the foil with baking spay, then arrange 2 sprigs of the rosemary down the middle. Cut one of the lemons into thin slices and arrange half the slices down the middle with the rosemary. Place the salmon on top.\n" +
                        "3- Drizzle the salmon with the olive oil and sprinkle with the salt and pepper. Rub to coat, then scatter the garlic cloves over the top. Lay the remaining rosemary and lemon slices on top of the salmon. Juice the second lemon, then pour the juice over the top.\n" +
                        "4- Fold the sides of the aluminum foil up and over the top of the salmon until it is completely enclosed. If your piece of foil is not large enough, place a second piece on top and fold the edges under so that it forms a sealed packet. Leave a little room inside the foil for air to circulate.\n" +
                        "5- Bake the salmon for 15-20 minutes, until the salmon is almost completely cooked through at the thickest part. The cooking time will vary based on the thickness of your salmon. If your side is thinner (around 1-inch thick) check several minutes early to ensure your salmon does not overcook. If your piece is very thick (1 ½ inches or more), it may need longer.\n" +
                        "6- Remove the salmon from the oven and carefully open the foil so that the top of the fish is completely uncovered (be careful of hot steam). Change the oven setting to broil, then return the fish to the oven and broil for 3 minutes, until the top of the salmon and the garlic are slightly golden and the fish is cooked through. Watch the salmon closely as it broils to make sure it doesn’t overcook and the garlic does not burn. Remove the salmon from the oven. If it still appears a bit underdone, you can wrap the foil back over the top and let it rest for a few minutes. Do not let it sit too long—salmon can progress from “not done” to “over done” very quickly. As soon as it flakes easily with a fork, it’s ready.\n" +
                        "7- To serve, cut the salmon into portions. Sprinkle with additional fresh herbs or top with an extra squeeze of lemon as desired.\n" + "" +
                        "**********NUTRITIONAL INTAKE**************" + "SERVING: 1(of 6), 5.3 ounces salmon CALORIES: 180kcal CARBOHYDRATES: 4g PROTEIN: 28g FAT: 6g SATURATED FAT: 1g CHOLESTEROL: 60mg FIBRE: 1g.\n", R.drawable.bakedsalmon));

        recipes1.add(new Recipes("Chicken and Avocado Soup","2 tsp olive oil\n" +
                "1-1/2 cups scallions, chopped fine\n" +
                "2 cloves garlic, minced\n" +
                "1 medium tomato, diced\n" +
                "5 cups reduced sodium chicken broth\n" +
                "2 cups shredded chicken breast, 12 oz\n" +
                "8 ounces from 2 small ripe hass avocados, diced\n" +
                "1/3 cup chopped cilantro\n" +
                "4 lime wedges\n" +
                "kosher salt and fresh pepper, to taste\n" +
                "1/8 teaspoon cumin\n" +
                "pinch chipotle chile powder, optional\n","Method",
                "1. Heat a large pot over medium heat.\n" +
                        "2. Add the oil, 1 cup of scallions and garlic. Sauté about 2 to 3 minutes until soft then add the tomatoes and sauté another minute, until soft.\n" +
                        "3. Add chicken stock, cumin and chile powder and bring to a boil. Simmer, covered on low for about 15 minutes.\n" +
                        "4. In four bowls, fill each with 1/2 cup chicken, 1/2 avocado, remainder of the scallions, and cilantro. Ladle 1 cup chicken broth over the chicken and serve with a lime wedge.\n" + "" +
                        "************NUTRITIONAL INTAKE*************" + "Serving: 13/4 cups, Calories: 297kcal, Carbohydrates: 14.5g, Protein: 31g, Fat: 14g, Saturated Fat: 2.5g, Cholesterol: 72.5mg, Sodium: 789.5mg, Fiber: 7.5g, Sugar: 2.5g. \n", R.drawable.chickenandavocadosoup));

        recipes1.add(new Recipes("Kimchi Soup","1 tablespoon toasted sesame oil\n" +
                "1 cup scallions, sliced (from 8 scallions)\n" +
                "2 tablespoons garlic cloves, sliced (about 4 garlic cloves)\n" +
                "1 (1-in.) piece fresh ginger, peeled and minced\n" +
                "1 (32-oz.) pkg. unsalted chicken or vegetable broth\n" +
                "2 tablespoons lower-sodium soy sauce\n" +
                "1 to 2 tablespoon gochujang\n" +
                "7 ounces silken tofu, cut into 4 1/2-in-thick x 3 1/4-in.-long slices (from [14-oz.] pkg.)\n" +
                "1 1/2 cups kimchi\n" +
                "1/4 cup chopped fresh Korean chives or garlic chives (optional)\n","Method",
                "Step 1\n" +
                        "Heat oil in a Dutch oven over medium-high; add scallions, garlic, and ginger. Cook, stirring often, until soft, about 3 minutes.\n" +
                        "Step 2\n" +
                        "Add broth, soy sauce, and gochujang; bring to a boil. Reduce heat to low, and add tofu and kimchi, stirring once, until heated through, about 3 minutes. Sprinkle with Korean chives, if desired.\n" +
                        "\n" + "**************NUTRITIONAL INTAKE***********" + "•\tCalories 117, Fat 5g, Satfat .5g, Unsatfat 3g, Protein 8g, Carbohydrate 11g, Fibre 1.5g, Sugars 2g, Added sugars 0g, Sodium 876mg, Calcium 7% DV,Potassium 8% DV.\n", R.drawable.kimchisoup));

        recipes1.add(new Recipes("Ratatouille","2 pounds ripe red tomatoes (6 medium or 4 large)\n" +
                "1 medium eggplant (1 pound), diced into ½-inch cubes\n" +
                "1 large red, orange, or yellow bell pepper (about 8 ounces), cut into ¾-inch squares\n" +
                "1 medium-to-large zucchini (about 8 ounces), diced into ½-inch cubes\n" +
                "1 large yellow squash (about 8 ounces), diced into ½-inch cubes\n" +
                "5 tablespoons + 1 teaspoon extra-virgin olive oil, divided\n" +
                "¾ teaspoon fine sea salt, divided, more to taste\n" +
                "1 medium yellow onion, chopped\n" +
                "4 cloves garlic, pressed or minced\n" +
                "¼ cup chopped fresh basil\n" +
                "¼ teaspoon red pepper flakes, more or less to taste\n" +
                "¼ teaspoon dried oregano\n" +
                "Freshly ground black pepper, to taste\n","Method",
                "1. Preheat the oven to 425 degrees Fahrenheit with one rack in the middle of the oven and one in the upper third of the oven. Line two large, rimmed baking sheets with parchment paper for easy clean-up, if desired.\n" +
                        "2. To prepare your tomatoes, remove any woody cores with a paring knife. Then, grate them on the large holes of a box grater into a bowl (this is easiest if you hold the tomato at a diagonal), and chop any remaining tomato skin. Or, blitz the tomatoes in a food processor until they are broken into a frothy pulp. Set aside.\n" +
                        "3. On one baking sheet, toss the diced eggplant with 2 tablespoons of the olive oil until lightly coated. Arrange the eggplant in a single layer across the pan, sprinkle with ¼ teaspoon of the salt, and set aside.\n" +
                        "4. On the other baking sheet, toss the bell pepper, zucchini and yellow squash with 1 tablespoon of olive oil and ¼ teaspoon salt. Arrange the vegetables in a single layer. Place the eggplant pan on the middle rack and the other vegetables on the top rack. Set the timer for 15 minutes.\n" +
                        "5. Meanwhile, warm 2 tablespoons of the olive oil in a large Dutch oven or soup pot over medium heat. Add the onion and ¼ teaspoon salt. Cook, stirring occasionally, until the onion is tender and caramelizing on the edges, about 8 to 10 minutes.\n" +
                        "6. Add the garlic, stir, and cook until fragrant, about 30 seconds. Add the tomatoes, and use a wooden spoon or sturdy silicone spatula to stir any browned bits stuck to the bottom of the pan into the mixture. Reduce the heat to medium-low, or as necessary to maintain a gentle simmer.\n" +
                        "7. Once 15 minutes are up, remove both pans from the oven, stir, and redistribute the contents of each evenly across the pans. This time, place the eggplant on the top rack and other vegetables on the middle rack.\n" +
                        "8. Bake until the eggplant is nice and golden on the edges, about 10 more minutes (the eggplant will be done sooner than the rest). Remove the eggplant from the oven, and carefully stir the eggplant into the simmering tomato sauce.\n" +
                        "9. Let the squash and bell pepper pan continue to bake until the peppers are caramelized, about 5 to 10 more minutes. Then, transfer the contents of the pan into the simmering sauce. Continue simmering for 5 more minutes to give the flavors time to meld.\n" +
                        "10. Remove the pot from the heat. Stir in 1 teaspoon olive oil, the fresh basil and red pepper flakes. Crumble the dried oregano between your fingers as you drop it into the pot. Season to taste with additional salt (I usually add ¼ teaspoon more) and black pepper.\n" +
                        "11. Serve in bowls, perhaps with a little drizzle of olive oil, additional chopped basil, or black pepper on top (all optional). Like all stews, this ratatouille’s flavor improves as it cools. It’s even better reheated the next day. Ratatouille keeps well in the refrigerator, covered, for 4 days, or for several months in the freezer.\n", R.drawable.ratatouille));

        recipes1.add(new Recipes("Beef and Broccoli Stir-fry","1 pound sirloin steak\n" +
                "2 tablespoons cornstarch, divided\n" +
                "1/4 teaspoon salt\n" +
                "1 tablespoon sesame oil\n" +
                "2 cloves garlic, minced\n" +
                "1/2 cup water\n" +
                "4 cups broccoli florets, chopped\n" +
                "1/2 cup vegetable broth\n" +
                "1/4 cup soy sauce\n" +
                "1 tablespoon toasted sesame seeds, optional\n","Method",
                "Gather the ingredients.\n" +
                        "Slice the sirloin steak into thin strips, against the grain to help with tenderness.\n" +
                        "Add the beef strips to a large plastic bag and pour in 1 tablespoon of the cornstarch and the salt. Shake the bag to mix the ingredients until the beef is well coated.\n" +
                        "Heat the sesame oil in a large skillet or wok over medium-high heat. Add the beef, and stir-fry for about 4 minutes, until it is no longer pink. Remove the beef from the pan, place it in a bowl, and set aside.\n" +
                        "Add the garlic to the skillet or wok and cook for 1 minute until it is very aromatic but not burnt. Carefully add the water and the broccoli. Continue cooking the broccoli for 4 to 5 minutes until it is bright green and more tender.\n" +
                        "\n" +
                        "While the broccoli is cooking, whisk together well in a small dish the remaining 1 tablespoon of cornstarch with the vegetable broth and soy sauce. Add this soy sauce and the beef back to the skillet.\n" +
                        "\n" +
                        "Cook the entire mixture an additional 1 to 2 minutes until the sauce thickens. Remove from the heat.\n" +
                        "\n" +
                        "Transfer to a serving bowl and sprinkle with optional toasted sesame seeds\n", R.drawable.beefandbroccolistirfry));

        recipes1.add(new Recipes("Asian Chicken and Vegetable Soup","1/2 tbsp canola oil \n" +
                "1/2 shallots, finely chopped \n" +
                "1 clove/tgarlic, minced \n" +
                "1/2 tbsp/ gingerroot, grated \n" +
                "1/2 dried chili peppers, minced \n" +
                "2 cups chicken broth \n" +
                "1 cup water \n" +
                "1 tbsp fish sauce (nam pla) \n" +
                "1 pinch salt [optional]\n" +
                "ground pepper to taste [optional]\n" +
                "160 g chicken for Chinese fondue \n" +
                "80 g rice sticks (noodles) \n" +
                "1 carrots, grated \n" +
                "1 green onions/scallions, thinly sliced \n" +
                "4 button (white) mushrooms, thinly sliced \n" +
                "1 1/2 cup soybean sprout\n","Method",
                "1. Heat the oil in a saucepan over medium-low heat. Add the shallot, then sauté 2-3 min. Add the garlic, ginger and chili pepper.Sauté 3 min with stirring. Pour in the broth and water, then add the fish sauce and a little salt and pepper. Bring to a boil, then lower the heat and simmer a few minutes. Adjust the seasoning. Add the chicken slices, warm up the broth 1 min, then take the saucepan off the heat.\n" +
                        "2. Meanwhile, cook the rice sticks for about 4 min in a large pot of salted boiling water. Drain in a colander, then rinse and drain again. Set aside.\n" +
                        "3. Prepare the vegetables: Grate the carrots, then thinly slice the green onions and mushrooms. Portion out the vegetables into individual serving bowls. Add the soybean sprouts and cooked rice sticks. Pour in the hot broth and serve.\n", R.drawable.asianchickenandvegetablesoup));

        recipes1.add(new Recipes("Asian Shrimp Soup","3 cups chicken broth \n" +
                "80 g/trice sticks (noodles) \n" +
                "1 carrots, grated \n" +
                "2 button (white) mushrooms, thinly sliced \n" +
                "9 tbsp green cabbage, or Savoy, thinly sliced \n" +
                "2 green onions/scallions, thinly sliced \n" +
                "14 shrimp, medium-large \n" +
                "1 1/4 tsp gingerroot, grated \n" +
                "1 clove/tgarlic, minced \n" +
                "1/2 /tdried chili peppers, minced \n" +
                "2 tbsp lime juice, freshly squeezed \n" +
                "2 tsp fresh cilantro [optional]\n" +
                "1 pinch salt [optional]\n","Method",
                "1. Cook the rice sticks then set aside.\n" +
                        "2. In a saucepan of salted boiling water, boil the shrimp about 3 min, until they become pink. Drain and set aside.\n" +
                        "3. Prepare the vegetables. Grate the carrots, slice the green onions, cabbage, and mushrooms. Portion out the vegetables into the individual serving bowls. Add the cooked rice sticks.\n" +
                        "4. Heat the broth in a saucepan. Add the grated ginger, minced garlic and chili pepper. Cook 2 min. Add the cooked shrimp and cook an additional 3-4 min. Adjust the seasoning.\n" +
                        "5. Pour the hot broth into the serving bowls. Add the lime juice, garnish with whole cilantro leaves, and serve.\n", R.drawable.asianshrimpsoup));



        myRV = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this,1));

        myRV.setAdapter(myAdapter);



    }

}