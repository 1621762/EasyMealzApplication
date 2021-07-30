package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VegetarianActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetarian);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Queso", "1/2 cup + 2 tablespoon (100g) raw sunflower seeds" +

                "1/2 cup (120g) Hot water" +

                "3/4 cup (180g) medium heat salsa" +

                "2 teaspoons (10g) apple cider vinegar" +

                "1 teaspoon maple syrup or agave" +

                "2 tablespoons (12g) nutritional yeast" +

                "1 teaspoon onion powder" +

                "1 teaspoon garlic powder" +

                "1-2 teaspoons ground cumin" +

                "1 teaspoon smoked paprika" +

                "1/2 teaspoon ground turmeric" +

                "1/2 teaspoon fine sea salt" +

                "5 or more pickled jalapeno slices",

                "Method",
                "1.If you don't have a high-powered blender, I suggest boiling the sunflower seeds for 10 minutes first to really soften then and make blending easier. I recommend a food processor to make the queso over a standard blender, because unless you have a Vitamix (or similar), regular blenders don't get things as smooth as a food processor will, with small amounts of liquid.\n" +
                        "2.Add all of the ingredients (except the jalapenos), starting with the liquids first, to a high-powered blender like a Vitamix. Blend starting on low and increasing to high. You will need to start several times in the beginning to scrape down the sides and stir from the bottom, as it is thick. Keep blending repeatedly and then once it's smooth, let it run a minute or two to get it very creamy.\n" +
                        "3.Add the jalapenos and briefly blend once more.\n" +
                        "4.I found these measurements to taste perfect, based on the heat level of my salsa, etc. But if you want it more spicy or more tangy, add more jalapeno slices and some of the jalapeno brine if you like. See the post for ways to serve this queso!\n" +
                        "5.This queso will last 4-5 days in the fridge. To reheat, heat on very low over the stove, stirring constantly, just until warm. I wouldn't recommend the microwave as it can get too thick.\n"
                        + "NUTRITIONAL INTAKE: Serving: 1/4 cup Calories: 95kcal Carbohydrates: 6.2g Protein: 3.4g Fat: 6.9g Saturated Fat: 0.3g Sodium: 351mg Potassium: 139mg Fibre: 2g Sugar: 3.3g Calcium: 33mg Iron: 1mg ", R.drawable.queso));

        recipes1.add(new Recipes("Burrito", "2 cups (280g) chopped red or golf potatoes" +

                "2 cups (240g) chopped bell pepper strips about 2 inches" +

                "1/2 teaspoon salt" +

                "1 cup (170g) cooked chickpeas, drained and rinsed if using canned" +

                "1 cup (135g) corn" +

                "1 cup (240g) smooth salsa" +

                "1 teaspoon ground cumin" +

                "1/4 teaspoon ground chipotle chile pepper spice" +

                "1 large avocado" +

                "1/2 teaspoon ground cumin" +

                "2 tablespoon (30g) salsa" +

                "1/2 tablespoon lime juice" +

                "1/4 teaspoon fine sea salt" +

                "large tortillas/wraps of your choice" +

                "optional garnish: fresh chopped jalapenos",

                "Method", "First, you'll need to roast your potatoes. Preheat the oven to 400°F (204°C) and line a sheet pan with parchment paper, so they don't stick. Spread the chopped potatoes out evenly and season lightly with salt and pepper. Make sure you've chopped your potatoes about 1/4 inch each. Bake for 20 minutes until tender and starting to brown. Make sure they are done by checking one with a fork.\n" +
                "While the potatoes are cooking, chop your bell peppers into 2 inch strips. Get all your chickpeas, corn and spices ready. When there is about 10 minutes left cooking for your potatoes, you can start to cook the bell peppers. That way everything should be done the same time.\n" +
                "Add your bell peppers to a large pan with a 1/4 cup (60g) water. Turn to medium heat and cook for 5-8 minutes until tender and the water is basically all evaporated. Don't move on to the next step until all the water has evaporated.\n" +
                "Add the chickpeas, corn, salsa, cumin and chipotle chile pepper (if using). Stir well to coat everything. Cook 5-10 minutes until everything is heated through and the sauce has thickened up. When the potatoes are done, stir them in last to the veggie mixture and remove the pan from the heat.\n" +
                "While the veggie mixture is cooking, prepare the avocado cumin cream by processing the ingredients either in a food processor or for faster results, I just used a hand immersion blender. Blend until smooth. Add more water if you want it thinner.\n" +
                "Add the cooked veggie mixture to your tortillas and drizzle the avocado cream inside and on top for presentation, if desired. Add optional chopped jalapeno for garnish. I loved the jalapeno but left it off for my hubby and daughter. The avocado cream is only good eaten right away, as it will turn brown.\n" +
                "You can wrap extra burritos tightly in foil (minus the avocado cream) and store them in the fridge. Just reheat in a toaster oven or regular oven at 300°F until warmed through.\n" +
                "NUTRITIONAL INTAKE: Serving: 1burrito Calories: 202kcal Carbohydrates: 31.8g Protein: 5.6g Fat: 6.25g Sodium: 744mg Fibre: 7.6g Sugar: 3.8g", R.drawable.burritos));

        recipes1.add(new Recipes("Burgers", "15 oz can low-sodium chickpeas, drained and well rinsed (or 1 1/2 cups of cooked, 255g)" +
                "1 cup (230g) cooked mashed sweet potato (either roasted whole or microwaved, don't steam)" +
                "1/2 cup + 2 tablespoons (150g) smoky barbecue sauce" +
                "1/4 cup coarse medium-grind cornmeal" +
                "1 teaspoon chili powder" +
                "1/2 teaspoon smoked paprika" +
                "1/4 teaspoon salt" +
                "optional veggie add-ins: corn, green onions, chopped parsley" +
                "1 cup tomato sauce/puree" +
                "2 tablespoons pure maple syrup" + "4 teaspoon fine sea salt" +
                "2 teaspoons liquid smoke" +
                "1 tablespoon worcestershire sauce" +
                "1 teaspoon garlic powder",
                "Method", "1.If making my barbecue sauce (recommended!!) then simply combine the \"5 minute smoky barbecue sauce\" ingredients in a small bowl until smooth. Now, try not to eat it all with a spoon. It tastes even better after sitting in the fridge overnight, so make it the day before the burgers if possible. You will only need 1/2 cup + 2 tablespoons of the sauce for the burgers, reserve the rest for topping the burgers with.\n" +
                "2.Next, cook your sweet potato whole (with skin on) either by roasting it at 400 degrees (fahrenheit, 205 degrees celsius) until super soft or cook it in the microwave. Steaming or boiling is not recommended, as too much water will get in the potatoes. Let it cool some before peeling off the skin and mash it completely with a fork. Measure out 1 cup fully filled (no gaps) mashed sweet potato.\n" +
                "3.Drain and rinse your chickpeas and pat dry. Add them to a large bowl and mash completely with a fork to where no visible whole chickpeas remain. \n" +
                "4.Add the cooled potato to the chickpeas.\n" +
                "5.Add the barbecue sauce (only 1/2 cup + 2 tablespoons), cornmeal, chili powder, smoked paprika and salt to the mix and stir until combined and thick. Taste and add any more salt if needed or spice. Note: the batter will be moist and soft, not stiff like you might expect, but they will be completely firm by the end of baking. \n" +
                "6.Place in the fridge for at least 20 minutes to firm up some.\n" +
                "7.Preheat an oven to 375°F and line a sheet pan with parchment paper. Form the mixture into patties using a 1/2 cup measuring cup by packing it in and flattening the top. You will get 5 burgers this way. If you want them more slider size, use a 1/4 cup. The mixture should be fairly easy to form into patties with your hands. Flatten them to about 3/4 inch.\n" +
                "8.Bake for 30 minutes on the first side. It will take this long to cook before you will be able to flip them. Remove and you must flip them carefully using a metal spatula. Using a spatula should make it fairly easy to slide it underneath the burgers. They should have started to form a cooked bottom. It they are sticking too much, cook them a few minutes longer until they come up better. After flipped, cook 10-15 more minutes until they have a nice golden brown top. The longer you cook them, the crispier the exterior will be. Let them cool 10 minutes to firm up some before eating.\n" +
                "9.Layer your burgers with avocado,tomatoes, extra barbecue sauce, lettuce or any toppings you desire!\n" +
                "NUTRITIONAL INTAKE: Serving: 1burger Calories: 142kcal Carbohydrates: 30.1g Protein: 4.3g Fat: 0.9gSaturated Fat: 0.1g Sodium: 349mg Potassium: 234mg Fibre: 2.6g Sugar: 9g Calcium: 26mg Iron: 4mg", R.drawable.burgers));

        recipes1.add(new Recipes("Noodles", "2 tablespoon natural almond butter" +
                "1 tablespoon white miso paste" +
                "2-4 tablespoons low-sodium broth" +
                "1/4 cup rice wine vinegar" +
                "1/4 tablespoon garlic chile paste" + "juice of 1 lime" +
                "2 tablespoon tamari, soy sauce or liquid aminos" +
                "1 tablespoon fresh ginger, grated or minced" +
                "3 cloves garlic" + "pinch of ground black pepper" +
                "6 ounces (170g) buckwheat noodles" +
                "2 cups asparagus, cut into 1 inch pieces" +
                "2 cups snow peas" +
                "1 small zucchini, cut into 1/4 rounds" +
                "1/4 cup red onion, chopped" +
                "1 cup grated carrot" +
                "1/2 cucumber, seeded and chopped" +
                "fresh cilantro" + "fresh mint" +
                "chopped roasted peanuts",
                "Method",
                "1.Fill a large pot with water and bring to a boil. Lightly cook the asparagus, snow peas and zucchini for about 3 minutes. You want the vegetables to retain their crunch and bright color. Using a slotted spoon, remove the vegetables and rinse with cool water - or if desired, place the vegetables in a water/ice bath for a few minutes. Drain thoroughly and set aside.\n" +
                        "2.Now add the buckwheat noodles to the boiling water and cook according to package directions. Drain and set aside.\n" +
                        "3.To make the sauce, place all of the sauce ingredients (starting out with just 2 tablespoons broth) in a high-speed or regular blender and process until very smooth. If desired, thin out the sauce with additional vegetable broth or water.\n" +
                        "4.Combine the sauce with the noodles, the cooked vegetables and the red onion, carrot and cucumber, and top with cilantro, mint and peanuts.", R.drawable.noodles));

        recipes1.add(new Recipes("Soup", "1 packed cup (160g) diced white or yellow onion" +
                "5 large garlic cloves, minced" +
                "1 3/4 pounds (1.75 lbs) peeled and chopped yukon gold potatoes into 1/2 inch pieces (plus 3 extra potatoes for roasting on top)" +
                "2 pounds peeled and chopped sweet potatoes into 1/2 inch pieces" +
                "6 1/2 cups low-sodium vegetable broth" +
                "5 tablespoons (75g) tomato paste, not tomato sauce" +
                "3 tablespoons (18g) nutritional yeast" + "1 teaspoon ground cumin" +
                "1/4 teaspoon cayenne pepper" +
                "1 1/2 teaspoons fine sea salt and 1/4 teaspoon pepper" +
                "chopped green onions for garnish",
                "Method",
                "1.This makes a lot! I use my 8 quart for this large recipe. Have all ingredients chopped and ready to go. Make sure all the potatoes are chopped into small 1/2 inch chunks similarly so they cook evenly.\n" +
                        "2.Add the onion to the instant pot and press the large pot (this makes a TON) with 1/2 cup of the broth over medium heat under the normal saute setting Cook about 5 minutes, stirring often. Add the garlic and cook another minute. Turn off.\n" +
                        "3.Add the remaining 6 cups of broth, tomato paste, nutritional yeast, cumin, cayenne (if using), salt and pepper and stir very well, making sure all of the ingredients are thoroughly mixed. Now stir in the potatoes. \n" +
                        "4.Seal the pot and cook on high pressure by selecting either manual or pressure cook and set the time to 10 minutes. Please note that it takes about 8-10 minutes before the IP will come to pressure and start the actual cooking. It will beep once it begins the 10 minutes cooking. \n" +
                        "5.See tip below to start roasting the extra potatoes.\n" +
                        "6.Once the 10 minutes are up on the instant pot, do a manual quick release of any remaining pressure, using a pot cover to protect your hand. \n" +
                        "7.Blend the whole soup with an immersion blender to a creamy consistency. The full flavor profile comes together through pureeing it. If you don't have an immersion blender, you can use a regular blender, but you'll have to do it in 2-3 batches, depending on the size of your blender. This makes so much that you will not be able to blend it all up at once. \n" +
                        "8.Tip: While the soup is cooking, chop up the remaining 3 yukon gold potatoes into small 1/2 inch pieces, season with salt/pepper, and bake at 425° for about 20 minutes (on parchment paper) or until golden brown. I love the texture it adds to the soup.\n" +
                        "9.Ladle into serving bowls and garnish with the roasted potatoes and fresh green onions or any other herb you like. This will serve 4 very large bowls or 8 regular soup size bowls. This soup is great served with vegan grilled cheese!", R.drawable.soup));

        recipes1.add(new Recipes("Tacos", "4 heaping cups (627g) chopped and peeled red potatoes in 1/2 inch chunks" +
                "1 tablespoon (15g) fresh lime juice" +
                "2 tablespoons (30g) water (add more as needed to make the cornmeal stick" +
                "1/4 cup (40g) cornmeal" +
                "1/2 teaspoon chili powder" + "1 teaspoon fine sea salt" + "2 cups (210g) chopped bell peppers" + "1/2 cup (80g) chopped onion" + "1 1/2 teaspoon chili powder" + "1 teaspoon cumin" + "1 1/4 teaspoon garlic powder" + "1/2 teaspoon fine sea salt" + "1 tablespoon lime juice" + "3/4 cup water" + "chopped avocado" + "corn or flour tortillas" + "mexican tahini sauce",
                "Method",
                "1.Peel and chop your potatoes into 1/2 inch pieces.\n" +
                        "2.Add 1 tablespoon lime juice and 2 tablespoons water to a large bowl and toss the potatoes in it to coat well. Preheat your oven at this time to 415 degrees and line a large sheetpan with parchment paper, do not use foil or the potatoes will stick!\n" +
                        "3.In a separate small bowl or cup, combine the cornmeal, chili powder and salt. (listed under the \"potatoes\") Toss that over the potatoes and stir to coat the potatoes well. If needed, add a tiny bit more water to make the cornmeal stick to the potatoes. Drain over a strainer any excess liquid and shake it off, you don't want the potatoes too wet before going into the oven. Spread them out evenly on the prepared pan. Bake for 25-30 minutes or until golden brown.\n" +
                        "4.While the potatoes are cooking, prepare the veggie mixture. Add all the ingredients listed under \"veggies\" to a large pan and stir well. Cook over medium heat for about 8 minutes with the lid on. They should be tender and the water evaporated after 8 minutes. Check on them a couple of times while they are cooking. If more water is needed, add just a tiny bit more. You don't want any remaining water though after they are done cooking.\n" +
                        "5.Remove your potatoes from the oven and immediately scrape them from the paper using a thin metal spatula. These tend to stick a bit, so you will need to use a spatula to remove them rather quickly to a plate. A thin spatula makes this easy.\n" +
                        "6.Serve in a bowl or in tacos or whatever you like. I eat them both as just breakfast potatoes and in tacos as a lunch/dinner. Top with the avocado and Mexican tahini sauce.\n" +
                        "7.These potatoes need to be eaten immediately while they are crispy, as they will start to soften sitting at room temperature. For leftovers and to make them crispy again, simply add them back to the oven at 300 degrees for just a few minutes.\n", R.drawable.tacos));

        recipes1.add(new Recipes("Cake", "4 tablespoons (28g) superfine blanched almond flour " +
                "2 tablespoons (16g) fine oat flour" +
                "1/2 tablespoon (4g) tapioca starch (or cornstarch)" +
                "2 tablespoons (12g) unsweetened natural cocoa powder" +
                "1/4 teaspoon baking powder" +
                "1/8 teaspoon fine salt" +
                "2 tablespoons (30g) water" +
                "2 tablespoons (40g) pure maple syrup" +
                "1/4 teaspoon vanilla extract" +
                "1 1/2 tablespoons (23g) dairy-free semi-sweet chocolate chips, divided",
                "Method",
                "1.To a bowl, combine the almond flour, oat flour, starch, cocoa powder, baking powder and salt and whisk very well, making sure to break up any lumps. If your cocoa is lumpy, sift it, otherwise it will not cook through well. Add ONLY 1 tablespoon of the chocolate chips. OVEN DIRECTIONS in step 6.\n" +
                        "2.Add the water, syrup and vanilla and stir well until the batter is completely smooth. The batter is not overly sweet, so this allows for a rich chocolate flavor to come through and also the sweetness from the chocolate chips gives the perfect touch of sweetness.\n" +
                        "3.Pour the batter into an 8 oz mug. Top the remaining 1/2 tablespoon of chocolate chips sprinkled on top. This can be spread after cooking to give a somewhat frosting effect, if desired.\n" +
                        "4.Place in the microwave and cook for 1 min 30 seconds. This was the perfect time for my microwave (full power) to cook it through to the perfect cake texture but not overcook it or make it dry. Obviously, all microwaves will vary. You will know it's done when the top of the mug cake has a cooked look and not still wet batter if you touch it. It should JUST be cooked on top (refer to the look of the cake in the photo).\n" +
                        "5.Set your timer for 4 minutes to cool before eating. The cake will be way too hot to eat immediately, and this allows the interior to finish cooking a bit. Depending on your microwave, you may need to alter the time to get it cooked to your liking. Enjoy!\n" +
                        "6.To make this in the oven, preheat the oven to 350°F (177°C) and line a muffin pan with 2 parchment paper muffin liners. Follow the same batter instructions and divide the batter evenly and top each with the remaining 1/2 tablespoon chocolate chips. Bake for 20-22 minutes until a toothpick comes out basically clean (a few crumbs are ok, not wet batter). Cool for 15 minutes before eating so they finish cooking.\n" +
                        "NUTRITIONAL INTAKE:Serving: 2servings Calories: 247kcal Carbohydrates: 34.7g Protein: 4g Fat: 12g Sodium: 153mg Fibre: 5.5g Sugar: 17.9g", R.drawable.cake));

        recipes1.add(new Recipes("Meatballs", "1/4 cup couscous + 1/4 cup water" +
                "1 15 oz can chickpeas, drained & rinsed & patted dry" +
                "1/2 cup (75g) chopped onion" +
                "6-8 tablespoon medium-heat salsa" +
                "3 tablespoons ketchup or more pizza sauce" +
                "1/2 teaspoon liquid smoke" +
                "2 tablespoon italian seasoning" +
                "1-2 tablespoons regular chili powder" +
                "1/2 teaspoon black pepper" +
                "1/2 teaspoon + 1/8 teaspoon more fine sea salt" +
                "1/2 cup (80g) brown rice flour",
                "Method",
                "1.First, make your couscous. Add the water to a small pot and bring to a boil, AS SOON as it starts bubbling, stir in the couscous quickly and remove from the heat. Cover and let sit for 5 minutes.\n" +
                        "2.I created this recipe using salsa for a wonderful depth of flavor, but some readers have subbed that with my pizza sauce, so that is an option too, for a more Italian flavor. If doing my pizza sauce, then reduce the Italian seasoning listed above from 2 tablespoons to only 1 (but following the exact recipe of my pizza sauce). \n" +
                        "3.In a food processor, add your chickpeas and onion and pulse to break up the mixture for a few seconds. Add all of the remaining ingredients, starting with just 6 tablespoons of the salsa or pizza sauce (you'll likely need 8 for the pizza sauce since it's thicker), except the couscous and brown rice flour.\n" +
                        "4.Pulse for just a few seconds, no more, just until the mixture resembles a wet rough chunky texture similar to a salsa. You don't want to over-blend and puree it too much or the balls will be too wet/mushy (refer to video for visual). You just want to make sure the chickpeas are no longer whole.\n" +
                        "5.Add the mixture to a large bowl and add the cooked couscous and brown rice flour. Stir for a few minutes until it all comes together in a sticky batter. Press the mixture repeatedly with the back of your spoon to make it come together. If the mixture is not sticking together, add a bit of the remaining salsa only if necessary. Once it is well mixed, place to chill in the fridge for about 20 minutes. This will make it easier to roll into balls.\n" +
                        "6.Preheat your oven to 375 degrees and line a sheet pan with parchment paper. Roll about 14 golf-sized balls with your hands, making sure they are tight and compact and place on the pan. Bake for 15 minutes on the first side, they should easily turn over. I just used my hand to flip them over. Bake another 15 minutes until firm and getting a nice golden brown crust. If you want them super crispy, go another 5 minutes. These balls are very moist inside so they can withstand the crispy exterior.\n" +
                        "7.While they are baking, heat up your pasta and marinara sauce of choice, or I highly recommend my 5 minute pizza sauce which works amazing as a spaghetti sauce! When the balls are done, coat them well with lots of sauce and pasta and enjoy!\n" + "NUTRITIONAL INTAKE: Serving: 1ball Calories: 84kcal Carbohydrates: 16g Protein: 2.6g Fat: 1.2g Saturated Fat: 0.2g Sodium: 253mg Potassium: 130mg Fibre: 2.2g Sugar: 1.5g Calcium: 17mg Iron: 1mg", R.drawable.meatballs));

        recipes1.add(new Recipes("Pizza", "1 batch of spinach pesto" +
                "1 batch of lemon parmesan cheese" +
                "fresh basil" +
                "red pepper flakes" +
                "vegan flatbread",
                "Method",
                "1.First, make the vegan spinach pesto. Store in the fridge until ready to use. It will last 4-5 days in the fridge.\n" +
                        "2.Make the lemon parmesan cheese. This can be made many days in advance and will stay fresh in the fridge.\n" +
                        "3.Make the flatbreads, which I recommend the day of for the best fresh taste, but the day before is fine, too. Just make sure to seal them well, so they don't dry out.\n" +
                        "4.Once you have all the components made, if using flatbread that is just made and is still warm, go ahead and warm up the pesto (if it's in the fridge) either in the microwave or stove until heated through.\n" +
                        "5.Spread the pesto on the flatbread with an even generous layer.\n" +
                        "6.Top with lots of the vegan lemon parmesan cheese.\n" +
                        "7.Top with red pepper flakes and chiffonade basil. Enjoy!\n" +
                        "NOTE: If wanting to heat up the whole pizzas instead of warming up the pesto first and melt cheese or something, then just spread the pesto on each flatbread and add whatever toppings and heat in the oven at 375°F  for about 10 minutes. DO NOT add the parmesan cheese until after though or it will burn since it has already been cooked.", R.drawable.pizza));

        recipes1.add(new Recipes("Brownies", "1 cup (140g) raw, unsalted sunflower kernels" +
                "1/4 cup + 2 tablespoons (36g) unsweetened cocoa powder" +
                "1 teaspoon baking powder" +
                "1/2 cup (160g) pure maple syrup" +
                "2 teaspoons (10g) vanilla extract" +
                "1/4 cup + 2 tablespoons (90g) water" +
                "3 tablespoons (30g) brown rice flour" +
                "2 tablespoons (16g) oat flour" +
                "1/4 heaping cup (60g) + extra on top dairy free chocolate chips",
                "Method",
                "1.Preheat the oven to 350°F (177°C) and spray WELL a 9X5 loaf pan with nonstick spray. I tried some with parchment paper and didn't like how they stuck to the paper and were more fragile. \n" +
                        "2.Add the sunflower kernels to a food processor and process for 30 seconds until a flour is formed. Add the cocoa powder, baking powder and salt and process again until just mixed.\n" +
                        "3.Add the syrup, vanilla and water and process for 3 minutes or so until completely smooth. Scrape the sides down and process for a few more seconds. It should be COMPLETELY SMOOTH and no chunks of sunflower kernels left before adding the flours next. If it's not all mixed and smooth, you will end up with dry crumbly brownies since the fat from the sunflower kernels is what makes these so fudgy!\n" +
                        "4.Add the brown rice flour and oat flour (or all-purpose flour) and process again until it is all blended and thick like a smooth nut-butter consistency. Add the batter to a bowl and make sure to scrape out all of that chocolatey goodness. Stir in the chocolate chips.\n" +
                        "5.Pour the batter into the prepared pan and spread out evenly to the corners. Place extra chocolate chips on top. \n" +
                        "6.Bake for 35-40 minutes depending on your oven. I would suggest checking yours at 35 minutes. I took mine out closer to 40 minutes. Here is the thing, these will not look done based on the top of the brownies, but will form that shiny firm top AFTER they are out of the oven cooling. Do not check for a clean toothpick either, it will not come out clean. It shouldn't be wet batter, but more of a sticky batter. The edges should be firm and have slightly pulled away from the pan. If you are doing a version with all of all-purpose flour in place of the oat and brown rice flours, then they were done at 35 minutes and just slightly more cakey/puffy.\n" +
                        "7.Cool for 45 minutes to an hour, with no exception. They will fall apart if you try to remove them earlier. Carefully cut them with a smooth sharp knife. Gently remove the first brownie and then the others by sliding a spatula underneath. Then they will firm up considerably even more as they sit on a plate. They will be firm, moist, and super fudgy. Store at room temperature wrapped tightly in foil.\n" + "" +
                        "NUTRITIONAL INTAKE: Serving: 1brownie Calories: 229kcal Carbohydrates: 29.2g Protein: 5.3g Fat: 12.1g Sodium: 78mg Fibre: 4.3g Sugar: 16.1g", R.drawable.brownies));

        myRV = (RecyclerView) findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this, recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this, 1));

        myRV.setAdapter(myAdapter);


    }
}

