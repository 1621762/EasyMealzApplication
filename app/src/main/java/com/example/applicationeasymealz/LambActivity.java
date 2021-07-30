package com.example.applicationeasymealz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LambActivity extends AppCompatActivity {

    RecyclerView myRV;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamb);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Lamb Saddle with herbed stuffing","•\t1.5kg boned saddle of lamb\n" +
                "•\t6 cloves garlic\n" +
                "•\tSmall bunch, rosemary, leaves picked\n" +
                "•\tSmall bunch parsley, roughly chopped\n" +
                "•\t6 Anchovies\n" +
                "•\tJuice and zest of 1 lemon\n" +
                "•\t4tbsp olive oil\n" +
                "•\tSalt and black pepper\n","Method",
                "•\tPreheat the oven to 200C. Put the garlic, rosemary leaves, chopped parsley, anchovies, juice and zest of the lemon, 2tbsp olive oil and 1/2tsp black pepper in a small food processor and blitz until everything has combined and is finely chopped up. If it seems a little dry you can mix through a little extra oil. Leave to one side.\n" +
                        "•\tPlace the lamb saddle fat side down on a clean, flat surface (a chopping board will work well). Spread the herby mixture down the middle of the meat and roll the saddle into a sausage shape. Tie the saddle together with kitchen twine to ensure the derby mixture doesn’t fall out during cooking. \n" +
                        "•\tRub the saddle all over with the remaining olive oil and season with salt and pepper. Heat a large frying pan and once hot sear the meat all over to give it a nice golden colour. Place into a baking tray.\n" +
                        " \n" +
                        "•\tRoast in the oven for 45mins to 1hr depending on how pink you like your meat. Lamb is best served pink. Leave to rest for at least 15mins before serving.\n", R.drawable.lambsaddle));

        recipes1.add(new Recipes("Slimming World's Lamb Tagine","•\tLow-calorie cooking spray\n" +
                "•\t1 Onion, finely chopped\n" +
                "•\t1 tbsp Ground cumin\n" +
                "•\t2 tsp Ground cinnamon\n" +
                "•\t1 tsp Turmeric\n" +
                "•\t2 tsp Coriander\n" +
                "•\t1 tsp Dried red chilli flakes\n" +
                "•\t500g Lean lamb leg steaks, visible fat removed, cut into bite-sized pieces\n" +
                "•\t400g Can chopped tomatoes\n" +
                "•\t2 tbsp Tomato purée\n" +
                "•\t2 tsp Sweetener\n" +
                "•\t4 Carrots, peeled and cut into chunks\n" +
                "•\t2 Courgettes, halved lengthways and sliced\n" +
                "•\tSmall handful finely chopped fresh coriander, to garnish\n" +
                "\n","Method",
                "•\tSpray a non-stick casserole pan with low-calorie cooking spray and place over a high heat. Add the onion, spices and lamb and stir-fry for 5-6 minutes.\n" +
                        "•\tAdd the tomatoes, tomato purée and sweetener and bring to the boil.\n" +
                        "•\tReduce the heat to low then cover and simmer for 35-40 minutes or until the meat is tender.\n" +
                        "•\tStir in the carrots and courgettes and cook for a further 15 minutes or until the vegetables are tender. Season to taste, scatter over the coriander, and serve hot.\n", R.drawable.slimminglambtagine));

        recipes1.add(new Recipes("Baked Lamb Steak","•\t275g (10oz) new potatoes, thickly sliced\n" +
                "•\t1tbsp oil\n" +
                "•\t4 lamb leg steaks\n" +
                "•\t1 red onion, chopped\n" +
                "•\t2 garlic cloves, crushed\n" +
                "•\t450ml (3/4pt) lamb stock\n" +
                "•\t1tbsp) Worcestershire sauce\n" +
                "•\t2tsp dried mixed herbs\n" +
                "•\t10 cherry tomatoes, halved\n" +
                "•\tFresh oregano or thyme leaves to garnish\n","Method",
                "•\tPreheat the oven to 190°C/375°F/gas 5. Parboil the potatoes in lightly salted water for 2-3 mins. Drain well.\n" +
                        "•\tHeat the oil in a large frying pan and fry the lamb steaks over a high heat for 1-2 mins on each side until browned. Transfer to a shallow ovenproof dish.\n" +
                        "•\tAdd the onion and garlic to the pan and fry for 5 mins. Stir in the stock and Worcestershire sauce and bring to the boil. Pour over the lamb steaks and add the potatoes. Sprinkle with dried herbs, season with salt and freshly ground black pepper, and cook for 30 mins.\n" +
                        "•\tAdd the cherry tomatoes and return to the oven for a further 10-15 mins. Served garnished with fresh oregano or thyme leaves.\n", R.drawable.bakedlambsteak));

        recipes1.add(new Recipes("Keema Curry","•\t2tsp sunflower oil\n" +
                "•\t1 onion, chopped\n" +
                "•\t2 garlic, crushed\n" +
                "•\t3cm piece fresh ginger, chopped\n" +
                "•\t1 green chilli, deseeded and chopped\n" +
                "•\t1tbsp garam masala\n" +
                "•\t1tsp each ground cumin, coriander\n" +
                "•\tPinch turmeric\n" +
                "•\t3 large tomatoes, chopped\n" +
                "•\t500g lamb mince\n" +
                "•\t100g petits pois or garden peas\n" +
                "•\tSmall handful fresh coriander\n","Method",
                "•\tHeat a pan with 1tsp of the oil and gently cook the onion, garlic, ginger, chilli and spices for 10-12 mins, until softened and fragrant. Add the tomatoes and cook for a further 5-6 mins. Tip into a blender and whizz until smooth.\n" +
                        "•\tHeat the remaining oil in the same pan and fry the lamb mince over a high heat, breaking up as you cook to prevent big lumps. Reduce the heat, then pour over the spice mix and simmer, covered, for 15 mins.\n" +
                        "•\tAdd the peas for the final 5 mins. Top with fresh coriander and serve with steamed basmati rice, naan bread and mango chutney.\n", R.drawable.keemacurry));

        recipes1.add(new Recipes("Lamb Traybake with Feta and Roasted Veg","•\t1tbsp cumin seeds\n" +
                "•\t1tbsp coriander seeds\n" +
                "•\t400g minced lamb\n" +
                "•\t1 echalion shallot, finely chopped\n" +
                "•\t2 garlic cloves, minced\n" +
                "•\t50g fresh breadcrumbs\n" +
                "•\t1 egg yolk\n" +
                "•\t1tbsp dried oregano\n" +
                "•\t1tbsp chopped fresh mint, plus extra for garnish\n" +
                "•\tFor The Vegetables\n" +
                "•\t1tbsp olive oil\n" +
                "•\t500g charlotte potatoes, halved\n" +
                "•\t300g baby aubergines, halved\n" +
                "•\t1 large courgette, cut into 1in chunks\n" +
                "•\t250g cherry tomatoes\n" +
                "•\t100g Greek feta\n" +
                "•\t2-3tbsp natural yogurt, to serve\n","Method",
                "•\tpreheat the oven to 200C/Gas 6. In a frying pan, toast the spices until fragrant and then crush into a pestle and mortar, set aside.\n" +
                        "•\tMix the lamb, shallot, garlic, breadcrumbs and egg yolk together in a bowl, add in the dried oregano, fresh mint and half of the ground spices. Shape into balls and brown in hot frying pan.\n" +
                        "•\tMeanwhile, tip the veg into a deep baking tray, drizzle over the oil and toss together with the remaining ground spices. Add the meatballs and roast in the oven for 25-30 mins. Remove from the oven, sprinkle with fresh mint and crumble over the feta, with a drizzle of natural yogurt to finish.\n", R.drawable.lambtraybake));

        recipes1.add(new Recipes("Lamb Chops with Peas and Mint Puree","•\t8 lamb chop cutlets\n" +
                "•\t2 garlic cloves, crushed\n" +
                "•\tJuice of 1 lemon\n" +
                "•\t2tbsp olive oil\n" +
                "•\t2 small globe artichokes\n" +
                "•\t250g frozen peas\n" +
                "•\t½ small pack of fresh mint, leaves picked\n" +
                "•\t5tbsp crème fraiche\n" +
                "•\t½ a pack of chives\n" +
                "•\tJuice of ½ a lemon\n","Method",
                "•\tPreheat the oven to 200C/Gas 6. In a non-metallic bowl, mix the lamb chops with the garlic, lemon and 1tbsp oil and leave to marinade.\n" +
                        "•\tBring a pan of salted water to the boil, cook the artichokes for 10-15 mins until tender and a knife can be placed through them. Once soft, cut the artichokes into quarters, place in a baking tray and drizzle in a little oil. Cook for 10 mins in the hot oven until tender and crispy on the outside.\n" +
                        "•\tIn a heatproof bowl, cover the peas with just boiled water and leave to stand for 2 mins. Drain then add to a food processor with the mint, crème fraiche, chives, lemon juice and seasoning. Whiz until as smooth as you like and adjust seasoning.\n" +
                        "•\tHeat a wide pan over high heat and cook the lamb chops for 3, fat side down and then 3-4 mins each side, until browned and cooked to your liking. (You may need to do this in batches). Warm the puree through and serve with the lamb and artichoke.\n", R.drawable.lambchopswithpeas));

        recipes1.add(new Recipes("Pressure Cooker Hot-Peppered Lamb Curry","•\t2 fresh long green chillies\n" +
                "•\t2 tablespoons ghee or butter\n" +
                "•\t600g boned lamb leg, chopped coarsely\n" +
                "•\t2 large brown onions (400g), sliced thinly\n" +
                "•\t3 cloves garlic, crushed\n" +
                "•\t4cm piece fresh ginger (20g), grated\n" +
                "•\t3 cloves\n" +
                "•\t4 green cardamom pods, bruised\n" +
                "•\t2 cinnamon sticks\n" +
                "•\t2 teaspoons coarsely ground black pepper\n" +
                "•\t2 medium tomatoes (300g), chopped finely\n" +
                "•\t70g natural yogurt\n" +
                "•\t125ml water\n" +
                "•\t60ml lemon juice\n" +
                "•\t4 tablespoons finely chopped\n" +
                "•\tfresh coriander\n","Method",
                "•\tFinely chop 1 of the chillies; finely shred remaining chilli.\n" +
                        "•\tHeat half the ghee or butter in 5.5-litre pressure cooker; cook lamb, in batches, until browned. Remove from cooker.\n" +
                        "•\tHeat remaining ghee or butter in same cooker; cook onion, stirring, about 5 minutes or until browned lightly. Add garlic and ginger; cook, stirring, until fragrant. Return lamb to cooker with spices, tomato, chopped chilli, yogurt and the water; secure lid. Bring cooker to high pressure. Reduce heat to stabilise pressure; cook 25 minutes.\n" +
                        "•\tRelease pressure using the quick release method; remove lid. Stir in juice; season to taste. Serve sprinkled with coriander and shredded chilli and accompanied by steamed white long-grain rice, if liked.\n", R.drawable.pressurecookerhotpepperedlambcurry));

        recipes1.add(new Recipes("Tandoori Lamb Skewers","•\t350-500g lamb, cubed\n" +
                "•\t2-3tbsps tandoori curry paste\n" +
                "•\t2tbsps yogurt\n" +
                "•\tJuice of 1⁄2 a lemon\n" +
                "•\t1-2 green peppers, deseeded and cut into chunks\n" +
                "•\tLemon wedges, to garnish\n" +
                "•\tFresh mint, to garnish\n" +
                "•\tSkewers\n","Method",
                "•\tTip the lamb into a freezer bag and add the curry paste, yogurt and lemon juice. Seal the bag, then massage it to coat the lamb in the other ingredients. Leave to marinate for at least 30 mins, or preferably overnight.\n" +
                        "•\tThread the meat alternately with green pepper onto skewers. Cook on a griddle pan or under a hot grill at a moderate heat for 10-15 mins, turning them occasionally, until the lamb is cooked to your liking.\n" +
                        "•\tServe the kebabs with lemon wedges \n" + "***********NUTRTIONAL INTAKE************" + "Nutrition per portion\n" +
                        "RDA Calories 182 kCal/9% Fat 9g/13%  -  Saturates 3g/15%\n", R.drawable.tandoorilambskewers));

        recipes1.add(new Recipes("Lamb Balti with Spinach and Chickpeas","•\tZest and juice of 1 lime\n" +
                "•\t150g tub Greek-style yogurt\n" +
                "•\t400g lamb leg steaks or lamb neck fillets, trimmed and cut into small chunks\n" +
                "•\t1tbsp vegetable oil\n" +
                "•\t1 onion, peeled and sliced\n" +
                "•\t2 garlic cloves, peeled and crushed\n" +
                "•\t1 sweet potato, peeled, cut into small cubes\n" +
                "•\t3tbsp Balti spice paste\n" +
                "•\t400g can chickpeas, rinsed and drained\n" +
                "•\t300ml hot lamb or vegetable stock\n" +
                "•\t200-250g robust fresh spinach\n" +
                "•\tNaan breads, to serve\n","Method",
                "•\tMix the lime zest and juice with the yogurt in a large bowl. Add the meat, mix well and leave to marinate for 30 mins or longer. Meanwhile, heat the oil in a large pan, add the onion and garlic and cook for a few mins. Add the sweet potato cubes and cook for 10 mins, stirring occasionally until golden.\n" +
                        "•\tAdd the Balti paste, stir-fry for a couple of mins, then add the chickpeas and stock. Stir in the lamb in its marinade. Cook on a low heat for 25-30 mins, until meat and potato are tender. Add the spinach and let it wilt down. Serve with raita and naans.\n", R.drawable.lambbaltiwithspinach));

        recipes1.add(new Recipes("All in one Roast Lamb","•\t2tsp olive oil\n" +
                "•\t2 lamb steaks\n" +
                "•\t300g peeled potatoes\n" +
                "•\t1 red onion\n" +
                "•\t2 whole garlic cloves\n" +
                "•\t2 sprigs rosemary\n" +
                "•\t100ml white wine\n" +
                "•\tCherry tomatoes\n","Method",
                "•\tSet the oven to 200°C/400°F/Gas Mark 6.\n" +
                        "•\tHeat olive oil in an ovenproof frying pan. Add lamb steaks and fry for a couple of min on each side. Remove from pan.\n" +
                        "•\tAdd olive oil and, when hot, stir in peeled potatoes, cut into small chunks and onion, peeled and cut into wedges. Fry for 4-5 mins, stirring occasionally until the veg are browning.\n" +
                        "•\tAdd whole garlic cloves and sprigs of rosemary and put the lamb back in the pan.\n" +
                        "•\tRoast in the oven for 20 mins, then turn the potatoes and onion and pour in white wine. Balance a few cherry tomatoes on top. Roast for another\n" +
                        "•\t10-15 mins, until the tomatoes start to split. Serve with black olives\n", R.drawable.allinoneroastlamb));


        myRV = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myRV.setLayoutManager(new GridLayoutManager(this,1));

        myRV.setAdapter(myAdapter);



    }

}