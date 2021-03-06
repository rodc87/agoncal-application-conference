package org.agoncal.application.conference.rating.data;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class DataToDatabase {

    private static String ratingCreateSQLStatement;
    private static List<String> attendees = Arrays.asList(
        "7c0481a08abe0ca9d96757d281fffc3021c53att",
        "d4f627022d99644546b010cb43135cf5bda26att",
        "4bb322b2277f75094ae724fd3c5098a3bd724att",
        "43ce34bea56fe72ae8953bb9d0fb435d8c9d0att",
        "85eb850bb5c8fc040bbd1b2b8fb87a45b6edbatt",
        "2cccded8e04230f783be71cfc810ac894ad17att",
        "9045e35c33f0b3ece6f2999d54f45d6eb1288att",
        "05e7f4c978f2eee6d72772759b710cebfb99batt",
        "008d535cc6edc8f588132e06681405d8dbc13att",
        "d363a9b518e1184510dc05363aac5a8bcec23att",
        "807f997035241709eddcd11b1482daec55caaatt",
        "9c43a38cec7ddebf95339cecc5f273f8e3c91att",
        "d969cedfa217ca603271fcddb924f751f09b5att",
        "c98c9945b2dc59057a4b3a88b801f57c5578fatt",
        "9cd06a0d84f3f9f59df8379e7f20556e95124att",
        "e24f340125809f10ff3f4cb520baaa30aaf31att",
        "f66fc6dd83e21f5f4705f6dd398edd5ec87f5att",
        "19783504be2af7964e5c5fcd31c3e81fc95f2att",
        "490f92610c9ff61abcdbee360ae57a92a2f53att",
        "cdb15eb8dbf4dc6dd2ea219f0b8ec2de78c8aatt",
        "ccfbb4ae10b6a86e17ed2eda90578e3c6fe67att",
        "4292786bfc2f6304735ba46d0c2285c102190att",
        "bb432b5185ba9edac4785814569fa51e15cf5att",
        "d780d8be32264fc25bdd5c861d352016d54c7att",
        "74fa0ef27630b6998f023e77284c09d8b9ed0att",
        "fe013e6b8075a360bd8a19277143eb8515a52att",
        "2cc190fa484c7d7025884c88faabfd7303b50att",
        "015b740be16549191467fea83ecc3930eea5aatt",
        "2c99799e400133829781d79a355bcd7e9cf3batt",
        "07f155b63c57b75be16ec9a3839263d117c1batt",
        "429d8d0ea6b9f430ecd8a6a13930783456032att",
        "0d5a5fef63ad94f1de5ebe6ad32fcd0f82ce8att",
        "f5bed9d28ec5b329c3720a97abdd63dd044e9att",
        "f196570972b445ae68439259113d6d18bed43att",
        "4f2886cb31a3760830c4b6ace84b46b3b1440att",
        "dd608cc5b9e2303722b8fba1b28ec47a54314att",
        "b302be1aa3495acd1024b7dd1170ef12deaedatt",
        "83958251b66f2ad1f09ec0353209f36d289dfatt",
        "8758fe22aefa09b5eb0bcf3c27e787aebb2c8att",
        "3f1d86e6d72ec5697cf1947c9ba45a5d4b9d9att",
        "22ce02b68a018526a0d6b5d4e11cb9c93b1e5att",
        "86805ddb9d268e14c97d47c3f616141246a7batt",
        "35074b2d9c53c2d2ccf8ffaf446f64f7f47a1att",
        "8bdea2eec06d17d8f9c762c8db7d2acef95f6att",
        "7070145d0fd62e5e92af577bd14fa305993c8att",
        "91fd808dc0701cf06e671697c79573cd536ebatt",
        "154d6113c0291792412bd5eae51894fdf3ba8att",
        "89f2deba8bc1faf47588eef816d1f2a4db55datt",
        "51cd8aa37d1f3832ef71d5aa92f6ee795ed9catt",
        "645282f13989f415c5029d25f8b75ac99d937att",
        "a4cb83b34e086e694a1dff20ef79d60060b71att",
        "dc61d5c028dceb9ce4fd55623c6f725f3666aatt",
        "98e120d793bc49793f115ac9d68e798cb8544att",
        "b4b847566dd06007e0a8b83dbaf60e8ef653eatt",
        "286c8e3ad0804742a1c2fd4c624cf0a0aeeb5att",
        "d1a9eebcc55ffdf506c2b2de963fdaeb977a5att",
        "700bbf396f3aff6b7922651a170fd0cdb7742att",
        "53e4d39f5b5e09e9e3fdfa13351b042563024att",
        "69e5596a50112585d5acdb93e0a4da47a10a6att",
        "3b4de9092cd9236a4953c5e8bffed0c5de2f7att",
        "8e1d424fe57b5930a389f82016f70e8182eb1att",
        "b1bb168b9db74c92ef08c169ff82049994b9datt",
        "ec1018418b1aa0e5590bdaf6903c3e43b4213att",
        "55718f7a7b317aa6799f2107b85293c9236e0att",
        "9d62326640a048a4fed036ef084a04bf7a066att",
        "d26edf9da1fc430dc7c69fa40a388074ac287att",
        "ec702c20a7862950c6aadeafe8ae7d2bc9736att",
        "13df3212eb1d6abc512ca9e87383a24c18be9att",
        "4c2fdcd016f9fac3822bfecf9b7ca0ad2e080att",
        "4b92b9fcc31eae2b6236147b1db6a30609b43att",
        "3d3fdff9990e194e6f066406399d876cb21c4att",
        "e7072231ed75ccc4c858b39ff383f3d9f581catt",
        "3dbbbea1c38d6d0de81c33209b01459add315att",
        "7ab646f39c273ee481f33ca5c7d276de97bf4att",
        "6c60105ca629cf9bf4112873ae0cb7ab63ebfatt",
        "4534bb179a48d170a391fda2aaa9bb8ca2da9att",
        "3bc7a089957e657c4fd84db48383d1ed0dab1att",
        "302ddc7693c6ead44bb25a85e595887900089att",
        "562bf2901f61783fcc632bae34c9a41ae7293att",
        "435988122123af3eac633c104bf3374aa019batt",
        "f2f4a153ee1a7a49b240ade95099f7dae8316att",
        "25e70a9fdad40deb097c8e6a111c968f38196att",
        "1f0d0d3b43b6800f20e8907e46c7e52ccf900att",
        "6ac127c3b063c3766eff1ac8fd3a82229c18catt",
        "e370781785be2e792a1e5b580bf15ff9c8035att",
        "ec4419ff9d00dc50d20a02965c771fa382586att",
        "5d086662f3cb6a6dac1e9831e25009b397a4catt",
        "c36bd2cdc776f5fefa10ae7a2c23931e2b88eatt",
        "698de7b880160572b00467a41063af3dde63batt",
        "a58ccd51e350fccb540ea5548cef107785624att",
        "88ee97792148e583e5b3f1887f5555b9b4d6fatt",
        "38d2691b5636d3ca7f90aac90a78913e96283att",
        "7d30948810c14651f08a7c5885b3a8fe30430att",
        "c9ddc27d09e6df6852e544ae773c114d0737datt",
        "924445c3b8a9867ec87dec9c5b77b970057dfatt",
        "b261ac2e7720e0273aa99c0ae911137dbea6batt",
        "d8869ba5631e5cfbb1df89c9ef78963d4725batt",
        "1fc3b702bc53c13474ce4d4445944516fbfaeatt",
        "6cc7bee528c635b5c291a27ab7f2ef7727529att",
        "a40db8a801d4a1ac40f85cae9c564f364491catt",
        "792bec285d3218d3bb1e5eaa0edc8de04cfc1att",
        "f3e39259fc4e182de0b35046bee41fb068588att",
        "a7748720f4f3b7d6442be252f2d77c5c4016catt",
        "1df589d7128f4b2ab6dce802646ae0c8fab98att",
        "a8c6b2c00e2073b2b112bf5167c6377cce8ccatt",
        "20289fe27fc18853a767cec8d11e309ec8355att",
        "976f36da5fef17db26329d785ae9aaee36958att",
        "95e8ca0120c1f54e22257af55c2d3e2ecc3bbatt",
        "d137ee90b1a9d0ef3313ce4f70be45206e63aatt",
        "35a6797008ce8295fcc76c03dcf0a58a07ab3att",
        "b429871520f3c38025899634df6687ab92672att",
        "fc09331c2af7f73207de69784a28669848745att",
        "dc9a936c05e293d5246bb04621b781a3547f4att",
        "4d21f1ffc609d1526dcb4e45e0df83a761af5att",
        "47db80869cbb6a248958008769a135a22b7deatt",
        "fead9c1a07fd243aa9ab9752e297b2367a55fatt",
        "086ee81a6a793d00454c89ff296aa36c8da1batt",
        "24aa289736bc1385ecc6cb9d3ff28626f0f50att",
        "dddfaeadf12001c77857dd7bf8abb3807fc86att",
        "d45a5d9f616cae7835f8150aadb2401d9968fatt",
        "79d1f13ebf6af17d604c910076403e1af24a6att",
        "a8dda8cb8342dfa44ecc47bab147e53f31452att",
        "8a7d68a8a2b09105c969cbae7b37019d4fa47att",
        "5b7818146d07c1223806713ba49af928f7613att",
        "6803674b215d4fff4273672f6ecfb79b9e377att",
        "72ea9cafac13b1a693767a9a9ec916e664a92att",
        "b1a97c7cc59214cb1ae166a5aa0696deb1b29att",
        "45f704377f504f2f5696fa38d27fcb123c1cfatt",
        "f51267a236f548f70af38b361fed5b91a82daatt",
        "e30667f7923c34c36ad101e18070c66c0b5c9att",
        "18600860ed96adfddf5ec1b55a59cb8224edeatt",
        "df4de82a843bfe028204d71f33761c1f53949att",
        "2c7f4aec436a0b9e8d1ac697ceadd59dae828att",
        "b66b325c3a780738504cf6ddbe056ca57f9e1att",
        "47a71873e0979f9e913204eb9bf9f0a10e6bcatt",
        "9f7e3e108522d43246e9ee2cb50eacc4c33f2att",
        "d0b43eaf98c70f5fc9f248e4be9acfdd01383att",
        "7549b17df8eee318ab4e483a40acc9ce6f961att",
        "a298ec44a3134ca0575b33a9a241cce5b5e3catt",
        "b533ad772229558dd84ab87eabd9c0f547a06att",
        "cc3a8573c1f955659203ddc442a9cc2a38bceatt",
        "aabe9619890c4e004000cd06fdc726eb5963aatt",
        "876066fcc0f3c0271dbee4beeddcb469475ccatt",
        "f4927cdd1d477ea155a78c1cd02a22adfe1ccatt",
        "bc76e6a7e689aef6550eb4b01e651ae0b4fa3att",
        "49cba39de93b8bc6a79d7c768fd035c740c54att",
        "4f14cae877379d57e8fbf0e3f10e58990e5b7att",
        "ae81ee16465977ffed76539db3ddcc8631cbbatt",
        "625442306a38685cab761e3e4860716b2b187att",
        "fd75fb3e042ec625a6bd0fbe4fa7325edb736att",
        "e0b120808282f82acf783cc111b4a9654ee03att",
        "066f7793bfe0e9b04bd65aa50e54d74777d5batt",
        "926d85f7b33ddf9364c89bcb1a21af9c18430att",
        "c45a52265225a14f7885f6c7b48c51ba3ae36att",
        "00cc2b259b5a0c29f7b2e7ff7faf59acea890att",
        "e31fa81e605e37acf1c3f71a3513a0554316batt",
        "d621911b576ad0fa9a70940ca938fbfc53157att",
        "040402c1f4650c82b23446bd1b5c76c907d6catt",
        "9f17f819d202fd15d48aaad29ed288da86ed6att",
        "5e4d9f47c30219784d96f7ac079d502f3df1aatt",
        "15fa238a9374e1217c261e5c28d8bf8b30f32att",
        "389ee7f7dc65991526e2dabfa5ad9bdad89cbatt",
        "35c847843b57fd2dcca89d67867bb4f49f3d5att",
        "7d5ef7abaae2d41369626d5f74ac3e37db63aatt",
        "90543f26e9c19a0ccedc90193530b77251caaatt",
        "7bec268694c2207cb2147ab33aa3ed7233365att",
        "d5654af4eabee673a0b8547db98b5843d440fatt",
        "1a71796ef71a9ad20bfb9bed7ff5a56ec0f2catt",
        "34621270b4d7c35aaf88f29b491a4744f9603att",
        "31f90ab8242bbf0356032cd4691e921961ba2att",
        "b0373499daae9e39b913a20f92d5b94823895att",
        "5b1076971a024eee603cf2a7ec7597469999fatt",
        "067d7f0c1c425482310485eb1b5d762a9455eatt",
        "7521a5bb8b36cca53e44ed733b9c153b16d7aatt",
        "509ff6d000200750fa592d2fbd37e03fefb98att",
        "8a4a0ae63fe2cfb61fd2853a3538f3a207fe9att",
        "867c68bd58777c1c0a8fd9051c1500a148869att",
        "2218229da8896c661f7f847206b93a018a82batt",
        "e823d046d9a9ee1413441c995855a52bbc895att",
        "c9855784c64bebd1c451293f8e613eaf8aa74att"
    );
    private static List<String> sessions = Arrays.asList(
        "reg_monday_7_8h0_9h30",
        "uni_room4_monday_7_9h30_12h30",
        "uni_room5_monday_7_9h30_12h30",
        "uni_room8_monday_7_9h30_12h30",
        "uni_room9_monday_7_9h30_12h30",
        "lab_bof1_monday_7_9h30_12h30",
        "lab_bof2_monday_7_9h30_12h30",
        "lunch_monday_7_12h30_13h30",
        "uni_room4_monday_7_13h30_16h30",
        "uni_room5_monday_7_13h30_16h30",
        "uni_room8_monday_7_13h30_16h30",
        "uni_room9_monday_7_13h30_16h30",
        "lab_bof1_monday_7_13h30_16h30",
        "lab_bof2_monday_7_13h30_16h30",
        "coffee_monday_7_16h30_16h45",
        "tia_room4_monday_7_16h45_17h15",
        "tia_room5_monday_7_16h45_17h15",
        "tia_room8_monday_7_16h45_17h15",
        "tia_room9_monday_7_16h45_17h15",
        "tia_room4_monday_7_17h25_17h55",
        "tia_room5_monday_7_17h25_17h55",
        "tia_room8_monday_7_17h25_17h55",
        "tia_room9_monday_7_17h25_17h55",
        "chgt_monday_7_17h55_18h15",
        "tia_room4_monday_7_18h15_18h45",
        "tia_room5_monday_7_18h15_18h45",
        "tia_room8_monday_7_18h15_18h45",
        "tia_room9_monday_7_18h15_18h45",
        "tia_room4_monday_7_18h55_19h25",
        "tia_room5_monday_7_18h55_19h25",
        "tia_room8_monday_7_18h55_19h25",
        "tia_room9_monday_7_18h55_19h25",
        "bof_bof1_monday_7_19h30_20h30",
        "bof_bof2_monday_7_19h30_20h30",
        "bof_bof1_monday_7_20h30_21h30",
        "bof_bof2_monday_7_20h30_21h30",
        "reg_tuesday_8_8h0_9h30",
        "uni_room4_tuesday_8_9h30_12h30",
        "uni_room5_tuesday_8_9h30_12h30",
        "uni_room8_tuesday_8_9h30_12h30",
        "uni_room9_tuesday_8_9h30_12h30",
        "lab_bof1_tuesday_8_9h30_12h30",
        "lab_bof2_tuesday_8_9h30_12h30",
        "lunch_tuesday_8_12h30_13h30",
        "uni_room4_tuesday_8_13h30_16h30",
        "uni_room5_tuesday_8_13h30_16h30",
        "uni_room8_tuesday_8_13h30_16h30",
        "uni_room9_tuesday_8_13h30_16h30",
        "lab_bof1_tuesday_8_13h30_16h30",
        "lab_bof2_tuesday_8_13h30_16h30",
        "coffee_tuesday_8_16h30_16h45",
        "tia_room4_tuesday_8_16h45_17h15",
        "tia_room5_tuesday_8_16h45_17h15",
        "tia_room8_tuesday_8_16h45_17h15",
        "tia_room9_tuesday_8_16h45_17h15",
        "tia_room4_tuesday_8_17h25_17h55",
        "tia_room5_tuesday_8_17h25_17h55",
        "tia_room8_tuesday_8_17h25_17h55",
        "tia_room9_tuesday_8_17h25_17h55",
        "exhib_tuesday_8_17h55_18h15",
        "tia_room4_tuesday_8_18h15_18h45",
        "tia_room5_tuesday_8_18h15_18h45",
        "tia_room8_tuesday_8_18h15_18h45",
        "tia_room9_tuesday_8_18h15_18h45",
        "tia_room4_tuesday_8_18h55_19h25",
        "tia_room5_tuesday_8_18h55_19h25",
        "tia_room8_tuesday_8_18h55_19h25",
        "tia_room9_tuesday_8_18h55_19h25",
        "bof_bof1_tuesday_8_19h30_20h30",
        "bof_bof2_tuesday_8_19h30_20h30",
        "bof_bof1_tuesday_8_20h30_21h30",
        "bof_bof2_tuesday_8_20h30_21h30",
        "reg_wednesday_9_8h0_9h30",
        "key_room8_wednesday_9_9h30_10h15",
        "key_room4_wednesday_9_9h30_10h15",
        "key_room5_wednesday_9_9h30_10h15",
        "key_room9_wednesday_9_9h30_10h15",
        "key_room8_wednesday_9_10h15_10h35",
        "key_room4_wednesday_9_10h15_10h35",
        "key_room5_wednesday_9_10h15_10h35",
        "key_room9_wednesday_9_10h15_10h35",
        "key_room8_wednesday_9_10h40_11h0",
        "key_room4_wednesday_9_10h40_11h0",
        "key_room5_wednesday_9_10h40_11h0",
        "key_room9_wednesday_9_10h40_11h0",
        "key_room8_wednesday_9_11h0_11h20",
        "key_room4_wednesday_9_11h0_11h20",
        "key_room5_wednesday_9_11h0_11h20",
        "key_room9_wednesday_9_11h0_11h20",
        "coffee_wednesday_9_11h40_12h0",
        "conf_room8_wednesday_9_12h0_13h0",
        "conf_room5_wednesday_9_12h0_13h0",
        "conf_room9_wednesday_9_12h0_13h0",
        "conf_room6_wednesday_9_12h0_13h0",
        "conf_room7_wednesday_9_12h0_13h0",
        "conf_room4_wednesday_9_12h0_13h0",
        "conf_room3_wednesday_9_12h0_13h0",
        "conf_room10_wednesday_9_12h0_13h0",
        "lunch_wednesday_9_13h0_14h0",
        "quick_room8_wednesday_9_13h10_13h25",
        "quick_room5_wednesday_9_13h10_13h25",
        "quick_room9_wednesday_9_13h10_13h25",
        "quick_room6_wednesday_9_13h10_13h25",
        "quick_room7_wednesday_9_13h10_13h25",
        "quick_room4_wednesday_9_13h10_13h25",
        "quick_room3_wednesday_9_13h10_13h25",
        "quick_room8_wednesday_9_13h35_13h50",
        "quick_room5_wednesday_9_13h35_13h50",
        "quick_room9_wednesday_9_13h35_13h50",
        "quick_room6_wednesday_9_13h35_13h50",
        "quick_room7_wednesday_9_13h35_13h50",
        "quick_room4_wednesday_9_13h35_13h50",
        "quick_room3_wednesday_9_13h35_13h50",
        "conf_room8_wednesday_9_14h0_15h0",
        "conf_room5_wednesday_9_14h0_15h0",
        "conf_room9_wednesday_9_14h0_15h0",
        "conf_room6_wednesday_9_14h0_15h0",
        "conf_room7_wednesday_9_14h0_15h0",
        "conf_room4_wednesday_9_14h0_15h0",
        "conf_room3_wednesday_9_14h0_15h0",
        "conf_room10_wednesday_9_14h0_15h0",
        "lab_bof1_wednesday_9_14h0_17h0",
        "conf_room8_wednesday_9_15h10_16h10",
        "conf_room5_wednesday_9_15h10_16h10",
        "conf_room9_wednesday_9_15h10_16h10",
        "conf_room6_wednesday_9_15h10_16h10",
        "conf_room7_wednesday_9_15h10_16h10",
        "conf_room4_wednesday_9_15h10_16h10",
        "conf_room3_wednesday_9_15h10_16h10",
        "conf_room10_wednesday_9_15h10_16h10",
        "coffee_wednesday_9_16h10_16h40",
        "conf_room8_wednesday_9_16h40_17h40",
        "conf_room5_wednesday_9_16h40_17h40",
        "conf_room9_wednesday_9_16h40_17h40",
        "conf_room6_wednesday_9_16h40_17h40",
        "conf_room7_wednesday_9_16h40_17h40",
        "conf_room4_wednesday_9_16h40_17h40",
        "conf_room3_wednesday_9_16h40_17h40",
        "conf_room10_wednesday_9_16h40_17h40",
        "conf_room8_wednesday_9_17h50_18h50",
        "conf_room5_wednesday_9_17h50_18h50",
        "conf_room9_wednesday_9_17h50_18h50",
        "conf_room6_wednesday_9_17h50_18h50",
        "conf_room7_wednesday_9_17h50_18h50",
        "conf_room4_wednesday_9_17h50_18h50",
        "conf_room3_wednesday_9_17h50_18h50",
        "conf_room10_wednesday_9_17h50_18h50",
        "meet_wednesday_9_18h30_20h0",
        "bof_bof1_wednesday_9_19h0_20h0",
        "bof_bof2_wednesday_9_19h0_20h0",
        "bof_bof1_wednesday_9_20h0_21h0",
        "bof_bof2_wednesday_9_20h0_21h0",
        "bof_bof1_wednesday_9_21h0_22h0",
        "bof_bof2_wednesday_9_21h0_22h0",
        "key_room8_thursday_9_19h0_19h45",
        "key_room4_thursday_9_19h0_19h45",
        "key_room5_thursday_9_19h0_19h45",
        "key_room9_thursday_9_19h0_19h45",
        "dej_thursday_10_8h0_9h30",
        "conf_room8_thursday_10_9h30_10h30",
        "conf_room5_thursday_10_9h30_10h30",
        "conf_room9_thursday_10_9h30_10h30",
        "conf_room6_thursday_10_9h30_10h30",
        "conf_room7_thursday_10_9h30_10h30",
        "conf_room4_thursday_10_9h30_10h30",
        "conf_room3_thursday_10_9h30_10h30",
        "conf_room10_thursday_10_9h30_10h30",
        "coffee_thursday_10_10h30_10h50",
        "conf_room8_thursday_10_10h50_11h50",
        "conf_room5_thursday_10_10h50_11h50",
        "conf_room9_thursday_10_10h50_11h50",
        "conf_room6_thursday_10_10h50_11h50",
        "conf_room7_thursday_10_10h50_11h50",
        "conf_room4_thursday_10_10h50_11h50",
        "conf_room3_thursday_10_10h50_11h50",
        "conf_room10_thursday_10_10h50_11h50",
        "conf_room8_thursday_10_12h0_13h0",
        "conf_room5_thursday_10_12h0_13h0",
        "conf_room9_thursday_10_12h0_13h0",
        "conf_room6_thursday_10_12h0_13h0",
        "conf_room7_thursday_10_12h0_13h0",
        "conf_room4_thursday_10_12h0_13h0",
        "conf_room3_thursday_10_12h0_13h0",
        "conf_room10_thursday_10_12h0_13h0",
        "ignite_bof1_thursday_10_13h0_13h5",
        "lunch_thursday_10_13h0_14h0",
        "ignite_bof1_thursday_10_13h5_13h10",
        "quick_room8_thursday_10_13h10_13h25",
        "quick_room5_thursday_10_13h10_13h25",
        "quick_room9_thursday_10_13h10_13h25",
        "quick_room6_thursday_10_13h10_13h25",
        "quick_room7_thursday_10_13h10_13h25",
        "quick_room4_thursday_10_13h10_13h25",
        "quick_room3_thursday_10_13h10_13h25",
        "ignite_bof1_thursday_10_13h10_13h15",
        "ignite_bof1_thursday_10_13h15_13h20",
        "ignite_bof1_thursday_10_13h20_13h25",
        "ignite_bof1_thursday_10_13h25_13h30",
        "ignite_bof1_thursday_10_13h30_13h35",
        "quick_room8_thursday_10_13h35_13h50",
        "quick_room5_thursday_10_13h35_13h50",
        "quick_room9_thursday_10_13h35_13h50",
        "quick_room6_thursday_10_13h35_13h50",
        "quick_room7_thursday_10_13h35_13h50",
        "quick_room4_thursday_10_13h35_13h50",
        "quick_room3_thursday_10_13h35_13h50",
        "ignite_bof1_thursday_10_13h35_13h40",
        "ignite_bof1_thursday_10_13h40_13h45",
        "ignite_bof1_thursday_10_13h45_13h50",
        "ignite_bof1_thursday_10_13h50_13h55",
        "ignite_bof1_thursday_10_13h55_14h0",
        "conf_room8_thursday_10_14h0_15h0",
        "conf_room5_thursday_10_14h0_15h0",
        "conf_room9_thursday_10_14h0_15h0",
        "conf_room6_thursday_10_14h0_15h0",
        "conf_room7_thursday_10_14h0_15h0",
        "conf_room4_thursday_10_14h0_15h0",
        "conf_room3_thursday_10_14h0_15h0",
        "conf_room10_thursday_10_14h0_15h0",
        "lab_bof1_thursday_10_14h0_17h0",
        "conf_room8_thursday_10_15h10_16h10",
        "conf_room5_thursday_10_15h10_16h10",
        "conf_room9_thursday_10_15h10_16h10",
        "conf_room6_thursday_10_15h10_16h10",
        "conf_room7_thursday_10_15h10_16h10",
        "conf_room4_thursday_10_15h10_16h10",
        "conf_room3_thursday_10_15h10_16h10",
        "conf_room10_thursday_10_15h10_16h10",
        "coffee_thursday_10_16h10_16h40",
        "conf_room8_thursday_10_17h50_18h50",
        "conf_room5_thursday_10_17h50_18h50",
        "conf_room9_thursday_10_17h50_18h50",
        "conf_room6_thursday_10_17h50_18h50",
        "conf_room7_thursday_10_17h50_18h50",
        "conf_room4_thursday_10_17h50_18h50",
        "conf_room3_thursday_10_17h50_18h50",
        "conf_room10_thursday_10_17h50_18h50",
        "bof_bof1_thursday_10_19h0_20h0",
        "bof_bof2_thursday_10_19h0_20h0",
        "closeKey_thursday_10_19h0_19h45",
        "bof_bof1_thursday_10_20h0_21h0",
        "bof_bof2_thursday_10_20h0_21h0",
        "movie_thursday_10_20h0_22h0",
        "bof_bof1_thursday_10_21h0_22h0",
        "bof_bof2_thursday_10_21h0_22h0",
        "dej_friday_11_8h30_9h30",
        "conf_room4_friday_11_9h30_10h30",
        "conf_room5_friday_11_9h30_10h30",
        "conf_room8_friday_11_9h30_10h30",
        "conf_room9_friday_11_9h30_10h30",
        "conf_room10_friday_11_9h30_10h30",
        "coffee_friday_11_10h30_10h45",
        "conf_room4_friday_11_10h45_11h45",
        "conf_room5_friday_11_10h45_11h45",
        "conf_room8_friday_11_10h45_11h45",
        "conf_room9_friday_11_10h45_11h45",
        "conf_room10_friday_11_10h45_11h45",
        "conf_room4_friday_11_11h50_12h50",
        "conf_room5_friday_11_11h50_12h50",
        "conf_room8_friday_11_11h50_12h50",
        "conf_room9_friday_11_11h50_12h50",
        "conf_room10_friday_11_11h50_12h50"
    );


    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 2000; i++) {

            ratingCreateSQLStatement = "INSERT INTO Rating (id, sessionId, attendeeId, rating) values (";

            ratingCreateSQLStatement += "'" + UUID.randomUUID().toString().replace("-", "") + "', ";
            ratingCreateSQLStatement += "'" + getRandomSessionId() + "', ";
            ratingCreateSQLStatement += "'" + getRandomAttendeeId() + "', ";
            ratingCreateSQLStatement += getRandomRating();

            ratingCreateSQLStatement += ");";
            System.out.println(ratingCreateSQLStatement);
        }
    }

    private static String getRandomSessionId() {
        Random rn = new Random();
        Integer session = rn.nextInt(262);
        return sessions.get(session);
    }

    private static String getRandomAttendeeId() {
        Random rn = new Random();
        Integer attendee = rn.nextInt(180);
        return attendees.get(attendee);
    }

    private static Integer getRandomRating() {
        Random rn = new Random();
        return rn.nextInt(5) + 1;
    }
}
