package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GlutenActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gluten);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Quiche with Sweet Potato Crust","5tablespoons extra-virgin olive oil, divided, plus more for pan\n" +
                "1½\n" +
                "pounds sweet potatoes (about 4 small), peeled, cut into ½-inch or smaller pieces\n" +
                "Kosher salt\n" +
                "1\n" +
                "large onion, thinly sliced\n" +
                "1\n" +
                "small bunch curly kale, stems removed, torn into bite-size pieces\n" +
                "12\n" +
                "large eggs\n" +
                "4\n" +
                "ounces sharp cheddar, grated (about 1 cup)\n" +
                "1\n" +
                "cup whole-milk Greek yogurt\n" +
                "Freshly ground black pepper\n","Method",
                "Step 1 Heat 2 Tbsp. oil in a large nonstick skillet over medium. Add potatoes, season with salt, and cook, tossing occasionally, until well browned around the edges and just slightly undercooked, 10–12 minutes. Transfer potatoes to springform pan and let cool; reserve skillet.\n" +
                        "Step 2 Lightly coat sides of pan with oil. Flatten potatoes slightly with the back of a spoon, packing into the seam where 2 parts of springform pan meet.\n" +
                        "Step 3 Preheat oven to 300°. Heat remaining 3 Tbsp. oil in reserved skillet over medium. Cook onion, tossing occasionally, until softened but not browned, 8–10 minutes. Add kale a handful at a time and cook, stirring, until just softened but not limp, 5–6 minutes. Season with salt. Let cool slightly.\n" +
                        "Step 4 Whisk eggs, cheese, and yogurt in a large bowl; season with salt and pepper. Set springform pan on a parchment- or foil-lined rimmed baking sheet. Top potatoes with half of kale and onions, then pour in egg mixture. Gently press remaining kale and onions into surface of egg mixture.\n" +
                        "Step 5 - Bake quiche until edges have puffed up slightly and top is just set with no liquid egg remaining, 55–75 minutes. Let cool before slicing.\n", R.drawable.quichewithsweetpotato));

        recipes1.add(new Recipes("Gluten-Free Coconut Bread","Non-stick vegetable oil spray\n" +
                "1\n" +
                "cup unsweetened shredded coconut\n" +
                "1½\n" +
                "cups white rice flour\n" +
                "¾\n" +
                "cup sorghum flour\n" +
                "¾\n" +
                "cup tapioca starch\n" +
                "1½\n" +
                "teaspoons baking powder\n" +
                "1½\n" +
                "teaspoons baking soda\n" +
                "¾\n" +
                "teaspoon kosher salt\n" +
                "½\n" +
                "teaspoon xanthan gum\n" +
                "1½\n" +
                "cups sugar\n" +
                "1½\n" +
                "cups unsweetened coconut milk\n" +
                "¾\n" +
                "cup vegetable oil\n" +
                "1\n" +
                "teaspoon coconut extract (optional)\n" +
                "4\n" +
                "large eggs\n" +
                "¼\n" +
                "cup unsweetened coconut flakes\n","Method",
                "Step 1 Place a rack in middle of oven; preheat to 350°. Line a 9x5\" loaf pan with parchment, leaving overhang on long sides; coat with non-stick spray (to use an 8½x4½\" pan, hold back 1 cup batter). Toast shredded coconut on a rimmed baking sheet, tossing occasionally, until lightly browned, 5–7 minutes. Let cool.\n" +
                        "Step 2 Whisk rice flour, sorghum flour, tapioca starch, baking powder, baking soda, salt, and xanthan gum in a medium bowl. Using an electric mixer on medium speed, beat sugar, coconut milk, oil, and coconut extract, if using, in a large bowl until sugar is dissolved and mixture is smooth, about 4 minutes. Add eggs one at a time, beating well after each addition. Beat mixture until very smooth, about 2 minutes. Reduce speed to low; beat in dry ingredients. Increase speed to medium; beat batter 5 minutes. Beat in toasted coconut. Scrape batter into prepared pan; top with coconut flakes.\n" +
                        "Step 3 Bake bread until top springs back when gently pressed and a tester inserted all the way to the bottom comes out with just a few moist crumbs attached, 80–95 minutes. Transfer pan to a wire rack and let bread cool in pan 10 minutes. Turn out bread onto rack and let cool completely.\n" +
                        "Step 4 Do Ahead: Bread can be baked 4 days ahead. Store tightly wrapped at room temperature\n", R.drawable.glutenfreecoconutbread));

        recipes1.add(new Recipes("Weeknight Steak and Rice Noodle Salad","small serrano chiles\n" +
                "1\n" +
                "small garlic clove\n" +
                "Kosher salt\n" +
                "¼\n" +
                "cup plus 2 Tbsp. fresh lime juice\n" +
                "3\n" +
                "Tbsp. fish sauce\n" +
                "3\n" +
                "Tbsp. honey\n" +
                "2\n" +
                "Tbsp. vegetable oil, divided\n" +
                "½\n" +
                "lb. skirt steak\n" +
                "6\n" +
                "oz. wide rice noodles\n" +
                "½\n" +
                "small head Napa cabbage, coarsely chopped\n" +
                "1\n" +
                "6\" piece daikon, peeled, thinly sliced\n" +
                "2\n" +
                "mini seedless cucumbers, thinly sliced\n" +
                "½\n" +
                "cup finely chopped mint, plus more leaves for serving\n" +
                "½\n" +
                "cup finely chopped roasted, salted peanuts, plus more for serving\n" +
                "\n","Method",
                "Step 1 Remove seeds from 2 chiles, then finely chop with remaining chile on a cutting board. Thinly slice garlic. Sprinkle a pinch of salt over. Mash chiles and garlic with the flat side of a chef’s knife on cutting board, alternating chopping and mashing, until broken down into a coarse paste. Transfer to a large bowl. Add lime juice, fish sauce, honey, and 1 Tbsp. oil, stirring vigorously to dissolve honey.\n" +
                        "Step 2 Place steak in a medium bowl and pour 3 Tbsp. dressing over, holding back any pieces of chile with a spoon; reserve remaining dressing in bowl. Let steak marinate, turning every minute or so, at least 10 minutes or up to 1 hour.\n" +
                        "Step 3 Meanwhile, bring a medium pot of salted water to a boil. Remove from heat, add noodles, and cover. Let sit, stirring every minute to keep from sticking, until noodles are al dente, 5–8 minutes. Drain and rinse under cold running water. Drain well again and set aside.\n" +
                        "Step 4 Combine cabbage, daikon, and cucumbers in a large bowl; season lightly with salt. Massage with your hands to release excess water. Drain off any water that pools in bottom of bowl.\n" +
                        "Step 5 Pat steak dry; season lightly with salt. Heat remaining 1 Tbsp. oil in a large non-stick skillet over medium-high. Add steak and cook, turning once, until browned all over, about 4 minutes per side for medium-rare. Let rest 5 minutes before cutting into pieces.\n" +
                        "Step 6 Add cabbage mixture, noodles, steak, ½ cup mint, and ½ cup peanuts to bowl with reserved dressing. Toss to combine; taste and season with salt if needed. Top with more mint and peanuts before serving.\n", R.drawable.weeknightsteakandricenoodlesalad));

        recipes1.add(new Recipes("Chickpeas and Dumplings","cup (15 g) nutritional yeast flakes or 3 Tbsp. (15 g) nutritional yeast\n" +
                "6\n" +
                "Tbsp. extra-virgin olive oil, divided, plus more for serving\n" +
                "1\n" +
                "medium onion, finely chopped\n" +
                "¾\n" +
                "tsp. ground turmeric, divided\n" +
                "½\n" +
                "tsp. kosher salt, plus more\n" +
                "2\n" +
                "Tbsp. yellow miso\n" +
                "4\n" +
                "garlic cloves, divided\n" +
                "1\n" +
                "15.5-oz. can chickpeas, rinsed, or 1½ cups cooked chickpeas\n" +
                "1\n" +
                "cup (100 g) chickpea flour\n" +
                "½\n" +
                "tsp. baking powder\n" +
                "½\n" +
                "tsp. cayenne pepper\n" +
                "Freshly ground black pepper\n" +
                "½\n" +
                "cup finely chopped dill\n" +
                "⅓\n" +
                "cup plain whole-milk Greek yogurt, plus more for serving\n" +
                "2\n" +
                "medium or 3 small celery stalks, thinly sliced on a diagonal\n","Method",
                "Step 1 Place nutritional yeast in a small bowl or measuring cup and pour in ⅔ cup hot water; stir to combine. Set aside.\n" +
                        "Step 2 Heat 2 Tbsp. oil over medium in a medium pot. Add onion and ½ tsp. turmeric, season with salt, and cook, stirring often, until onion is softened and starting to brown around the edges, 5–7 minutes.\n" +
                        "Step 3 Add miso to pot and finely grate in 3 garlic cloves. Cook, stirring and smashing down on miso constantly, until miso starts to darken and stick to the bottom of pot (similar to tomato paste), about 2 minutes. Add chickpeas and stir to coat. Carefully pour in golden liquid that’s floating atop the reserved soaking nutritional yeast, leaving as much of the sediment behind as you can (about ½ cup should remain but don’t stress if a little slips in); discard. Add 4 cups water. Increase heat to high and bring to a boil. Reduce heat so mixture is at a gentle simmer, cover pot, and cook soup while you make the dumpling batter.\n" +
                        "Step 4 Whisk together chickpea flour, baking powder, cayenne, ½ tsp. salt, and remaining ¼ tsp. turmeric. Season generously with black pepper. Add dill, ⅓ cup yogurt, 4 Tbsp. oil, and 2 tsp. warm water, then finely grate in remaining garlic clove. Stir with a wooden spoon or rubber spatula until no dry spots remain. Your dough should be thick and sticky.\n" +
                        "Step 5 Using damp hands, form dough into 10 balls (the easiest way to do this is to divide the dough in half, then divide each half into 5 pieces); place on a cutting board as you go. Gently drop dumplings into soup, cover pot, and simmer gently, until dumplings puff dramatically and float to the surface (to check for doneness, take 1 out and cut it open; it should be cooked through—the interior should look soft and not too dense), 7–9 minutes. Add celery, being careful not to smush dumplings, and simmer, uncovered, until celery is crisp-tender, about 3 minutes. Season broth with salt and black pepper.\n" +
                        "Step 6 Ladle broth and dumplings into bowls and top with a dollop of yogurt. Drizzle with oil and season with more black pepper.\n", R.drawable.chickpeasanddumplings));

        recipes1.add(new Recipes("Chocolate Buckwheat Waffles","cup mixed buckwheat groats, black or white sesame seeds, and/or flaxseeds\n" +
                "2\n" +
                "teaspoons plus 2 tablespoons pure maple syrup\n" +
                "Pinch of kosher salt\n" +
                "1\n" +
                "cup whole-milk ricotta\n" + "cup buckwheat flour\n" +
                "½\n" +
                "cup Dutch-process unsweetened cocoa powder\n" +
                "¼\n" +
                "cup flaxseed meal\n" +
                "1¼\n" +
                "teaspoons kosher salt\n" +
                "1\n" +
                "teaspoon baking powder\n" +
                "1\n" +
                "teaspoon baking soda\n" +
                "2\n" +
                "large eggs, room temperature\n" +
                "2\n" +
                "cups buttermilk\n" +
                "½\n" +
                "cup virgin coconut oil, melted\n" +
                "¼\n" +
                "cup (packed) dark brown sugar\n" +
                "2\n" +
                "teaspoons vanilla extract\n" +
                "2\n" +
                "ounces bittersweet chocolate, coarsely chopped\n" +
                "Nonstick vegetable oil spray\n" +
                "Pure maple syrup (for serving)\n","Method",
                "Step 1 Preheat oven to 300°. Toss buckwheat, 2 tsp. maple syrup, and salt on a rimmed baking sheet until evenly coated. Bake until dry to the touch and toasty smelling, 12–15 minutes. Stir to recoat and transfer to a sheet of parchment paper. Let crumble cool.\n" +
                        "Step 2 Whisk ricotta and remaining 2 Tbsp. maple syrup in a small bowl until smooth.\n" +
                        "WAFFLES AND ASSEMBLY\n" +
                        "Step 3 Heat a waffle iron on medium. Whisk buckwheat flour, cocoa powder, flaxseed meal, salt, baking powder, and baking soda in a large bowl to combine. Whisk eggs, buttermilk, coconut oil, brown sugar, and vanilla in a medium bowl until smooth. Add to dry ingredients and whisk until smooth; mix in chocolate.\n" +
                        "Step 4 Lightly coat waffle iron with non-stick spray. Scoop batter onto waffle iron (it should cover the entire surface; amount needed will vary according to model) and cook waffles until you smell a blast of chocolaty aroma hit you and edges are slightly darkened, around 3 minutes per batch. Remove carefully from waffle iron. Without gluten, waffles will be extra tender.\n" +
                        "Step 5 Serve waffles topped with whipped ricotta, crumble, and maple syrup.\n" +
                        "\n", R.drawable.chocolatebuckwheatwaffles));

        recipes1.add(new Recipes("Healthy Fried Chicken","cups buttermilk\n" +
                "3\n" +
                "Tbsp. plus ¾ tsp. Diamond Crystal or 5¾ tsp. Morton kosher salt, divided\n" +
                "4\n" +
                "lb. bone-in, skin-on chicken thighs, drumsticks, and/or wings\n" +
                "1¾\n" +
                "cups cornstarch, divided\n" +
                "2\n" +
                "cups chickpea flour\n" +
                "½\n" +
                "cup sesame seeds\n" +
                "Vegetable oil (for frying; 2–3 cups)\n" +
                "2\n" +
                "limes\n" +
                "3\n" +
                "Tbsp. unsweetened shredded coconut\n" +
                "1\n" +
                "Tbsp. crushed red pepper flakes\n" +
                "Honey (for drizzling)\n","Method",
                "Step 1 Whisk buttermilk and 2 Tbsp. Diamond Crystal or 3½ tsp. Morton kosher salt in a medium bowl to combine. Add chicken and toss to coat in buttermilk. Cover and chill at least 3 hours and up to 12 hours (go the full time if you can).\n" +
                        "Step 2 Drain chicken in a colander set over a bowl (the leftover buttermilk brine will become part of your coating later), using your hands to scrape off as much buttermilk as you can.\n" +
                        "Step 3 Place 1½ cups corn-starch in a shallow bowl. Whisk chickpea flour, sesame seeds, 1 Tbsp. Diamond Crystal or 1¾ tsp. Morton kosher salt, and remaining ¼ cup corn-starch in another shallow bowl. Add reserved ¼ cup of the buttermilk brine to the bowl with chickpea flour and rub in with your fingers until mixture is the texture of coarse meal with some larger pieces.\n" +
                        "Step 4 Set a wire rack inside a rimmed baking sheet and line with paper towels. Pour oil into a medium cast-iron skillet to come 1\"–1½\" up the sides. Prop thermometer in oil so bulb is submerged and heat over medium-high until thermometer registers 325°, about 5 minutes.\n" +
                        "Step 5 Meanwhile, finely grate lime zest into a spice mill or mortar and pestle with a Micro-plane. Cut limes into wedges; set aside for serving. Add coconut, red pepper flakes, and remaining ¾ tsp. Diamond Crystal or ½ tsp. Morton kosher salt to spice mill and grind to a fine powder.\n" +
                        "Step 6 Working with 1 piece at a time, dredge chicken in corn-starch, gently patting to remove excess. Dip in buttermilk brine, letting excess drip back into bowl, and coat in chickpea flour mixture, pressing firmly to adhere. Gently shake off any loose bits. Carefully slide chicken into skillet. Repeat with half of the remaining chicken. The oil temperature will drop when you add the chicken, so let it come back up to temperature gradually. Fry chicken, undisturbed, adjusting heat as needed so temperature never goes above 325°, until deeply golden-brown underneath, 9–11 minutes. Turnover and fry until other side is deep golden brown, about 7 minutes. Transfer chicken to prepared rack and let drain. Immediately drizzle with honey and sprinkle with half of coconut mixture. Repeat frying process with remaining chicken and coconut mixture.\n" +
                        "Step 7 Serve chicken with reserved lime wedges for squeezing over.\n", R.drawable.healthyfriedchicken));

        recipes1.add(new Recipes("Grain-Free Tahini Granola","cups mixed raw nuts, such as pistachios, pecans, walnuts, and/or almonds\n" +
                "1\n" +
                "cup unsweetened coconut flakes\n" +
                "¼\n" +
                "cup pure maple syrup\n" +
                "¼\n" +
                "cup tahini\n" +
                "2\n" +
                "Tbsp. extra-virgin olive oil\n" +
                "1¼\n" +
                "tsp. kosher salt\n" +
                "½\n" +
                "tsp. ground cardamom or cinnamon\n" +
                "\n", "Method",
                "Step 1 Preheat oven to 300°. Line a rimmed baking sheet with parchment paper or foil. Toss nuts and coconut in a large bowl. Whisk maple syrup, tahini, oil, salt, and cardamom in a medium bowl until combined. Pour tahini syrup over nut mixture and toss with a spatula until evenly coated. Scrape onto prepared sheet. Bake granola, tossing and rotating sheet from front to back every 10–15 minutes, until golden brown, 30–35 minutes total.\n" +
                        "Step 2 Let cool on baking sheet (granola will crisp as it cools), about 20 minutes. Break into pieces before serving.\n" +
                        "Step 3 Do Ahead: Granola can be made 2 weeks ahead. Store in an airtight container at room temperature.\n", R.drawable.tahinigranola));

        recipes1.add(new Recipes("Cauliflower Rice Pilaf","head of cauliflower (about 2¼ lb.), leaves removed, coarsely chopped into 1\"–2\" pieces\n" +
                "4\n" +
                "scallions\n" +
                "3\n" +
                "Tbsp. ghee or unsalted butter, divided\n" +
                "½\n" +
                "cup peeled, sliced almonds\n" +
                "½\n" +
                "tsp. ground cinnamon\n" +
                "½\n" +
                "tsp. crushed red pepper flakes\n" +
                "Kosher salt\n" +
                "3\n" +
                "Tbsp. golden raisins, chopped\n" +
                "\n","Method",
                "Step 1 Working in batches if needed, pulse cauliflower in a food processor until rice-size pieces form, being careful not to overprocess. Transfer to a medium bowl.\n" +
                        "Step 2 Trim scallions, then finely chop white parts. Thinly slice green parts on an angle; set these aside for serving.\n" +
                        "Step 3 Melt 2 Tbsp. ghee in a medium skillet over medium-high heat. Toast almonds, tossing occasionally, until they start to turn golden, about 3 minutes. Remove from heat and add cinnamon and red pepper flakes; season with salt and toss to coat. Transfer to a large bowl.\n" +
                        "Step 4 Melt remaining 1 Tbsp. ghee in same skillet over medium-high heat. Cook white scallion parts, stirring constantly, until golden brown, about 3 minutes. Add raisins and reduce heat to medium-low. Add cauliflower and cook, tossing occasionally, until some steam is released, and cauliflower is just tender, about 3 minutes.\n" +
                        "Step 5 Transfer cauliflower mixture to bowl with almond mixture; season with salt and toss to combine. Add reserved green scallion parts and toss once more before serving.\n", R.drawable.cauliflowerricepilaf));

        recipes1.add(new Recipes("Coconut Rice Noodles with Ginger and Turmeric","Kosher salt\n" +
                "5\n" +
                "oz. rice vermicelli\n" +
                "2\n" +
                "Tbsp. virgin coconut oil or vegetable oil\n" +
                "1\n" +
                "small red onion, thinly sliced\n" +
                "4\n" +
                "garlic cloves, thinly sliced\n" +
                "1\n" +
                "1\" piece ginger, peeled, finely grated\n" +
                "1\n" +
                "tsp. ground turmeric\n" +
                "1\n" +
                "tsp. coarsely ground black pepper, plus more\n" +
                "1\n" +
                "13.5-oz. can unsweetened coconut milk\n" +
                "1½\n" +
                "tsp. honey\n" +
                "1\n" +
                "Tbsp. fish sauce\n" +
                "Toasted unsweetened shredded coconut (for serving)\n" +
                "\n","Method",
                "Step 1 Bring a large saucepan of salted water to a boil. Remove from heat; add noodles. Let sit, stirring occasionally, until al dente, about 4 minutes (time may vary by brand). Drain and rinse under cold running water.\n" +
                        "Step 2 Meanwhile, heat oil in a large saucepan over medium. Cook onion and garlic, stirring often, until softened and golden, about 3 minutes. Add ginger, turmeric, and 1 tsp. pepper and cook, stirring, just until fragrant, about 1 minute. Add coconut milk, honey, and ¼ cup water. Bring to a simmer; cook until flavours come together, about 5 minutes.\n" +
                        "Step 3 Mix fish sauce and noodles into broth; season with salt if needed. Divide among bowls and top with shredded coconut and more pepper.\n", R.drawable.coconutricenoodleswithgingerandturmeric));

        recipes1.add(new Recipes("Gluten-Free Pizza","teaspoons sugar\n" +
                "1\n" +
                "teaspoon instant or active dry yeast\n" +
                "2¼\n" +
                "cups gluten-free baking flour, preferably King Arthur Measure for Measure (about 10 ounces)\n" +
                "⅓\n" +
                "cup almond meal\n" +
                "3\n" +
                "tablespoons ground flaxseeds\n" +
                "1\n" +
                "tablespoon Diamond Crystal or 1¾ teaspoons Morton kosher salt\n" +
                "1½\n" +
                "teaspoons baking powder\n" +
                "¼\n" +
                "cup olive oil, plus more for pans\n" +
                "1\n" +
                "tablespoon plus 1½ teaspoons apple cider vinegar\n" +
                "Pizza sauce, cheese, and herbs (for serving)\n" +
                "\n","Method",
                "Step 1 Combine sugar and 1⅓ cups warm (not hot, ideally about 100°) water in a small bowl. Sprinkle yeast over and let stand until yeast is beginning to foam and smells bready (if it doesn’t foam after 10 minutes, get new yeast).\n" +
                        "Step 2 Meanwhile, whisk flour, almond meal, flaxseeds, salt, and baking powder in the bowl of a stand mixer fitted with the paddle attachment. Beat in yeast mixture, followed by ¼ cup oil, then vinegar. Continue to beat on medium speed until dough is smooth and sticky (it will have the consistency of cake batter), 2–3 minutes. Cover bowl with plastic wrap and let rise in a warm place until dough is puffed slightly (it will not rise as dramatically as conventional dough would), and poking a finger into dough reveals it has formed bubbles throughout, 1–1½ hours.\n" +
                        "Step 3 Preheat oven to 325°. Lightly coat 2 large heatproof nonstick skillets with oil (sticking can be an issue with this dough, so nonstick baking sheets, or rimmed baking sheets lined with a silpat, are good alternatives). Divide dough between skillets (if you only have 1 skillet, chill remaining dough until ready to use). Using a large offset spatula or rubber spatula lightly coated with oil, spread dough to about ¼\" thick. (Cook’s Illustrated also suggests spraying plastic wrap with nonstick spray and pressing onto surface of dough to press flat, which also works well; the point is feel free to get creative.) Cover with plastic wrap and let dough rest until just slightly puffed again, 20–30 minutes.\n" +
                        "Step 4 Bake, rotating skillets halfway through, until very lightly browned across the top and top of dough springs back, 30–40 minutes.\n" +
                        "Step 5 Carefully arrange a rack in top third of oven; increase temperature to 425°. Top crusts as desired with sauce, cheese, and herbs. Bake pizzas until cheese is melted and bubbling and crust is golden brown and crunchy underneath, 10–12 minutes.\n" +
                        "Step 6 Do Ahead: Parbaked crusts can be made 1 month ahead; let cool, then wrap in plastic and freeze. Let crusts come to room temperature. Lightly coat skillets again with oil, top crusts as desired, then bake in a 425° oven 10–12 minutes.\n", R.drawable.glutenfreepizza));



        myRV = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this,1));

        myRV.setAdapter(myAdapter);



    }

}