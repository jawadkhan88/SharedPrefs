TinyDB -- Android-Shared-Preferences-Turbo
This class simplifies calls to SharedPreferences in a line of code. It can also do more like: saving a list of strings, integers and saving images. All in 1 line of code!

Example usage:

TinyDB tinydb = new TinyDB(context);

//Put data in database
tinydb.putInt("clickCount", 2);
tinydb.putFloat("xPoint", 3.6f);
tinydb.putLong("userCount", 39832L);

tinydb.putString("userName", "john");
tinydb.putBoolean("isUserMale", true);

tinydb.putList("MyUsers", mUsersArray);
tinydb.putImagePNG("DropBox/WorkImages", "MeAtlunch.png", lunchBitmap);

//Get data from database
int dataint = tinyDB.getInt("clickCount");
String datastring = tinyDB.getString("userName");
//These plus the corresponding get methods are all included
This is just an example of how easy it is to use. There are many more usefull methods included in the class. Enjoy :)

if you'd like to also save Objects, use the methods:

tinydb.putObject(key, object);
tinydb.putListObject(key, objectsArray);
Example of saving Objects:

Person person = new Person("john", 24);
tinydb.putObject("user1", person);

ArrayList<Person> usersWhoWon = new ArrayList<Person>();
tinydb.putListObject("allWinners", usersWhoWon);


Example usage
getApplicationContext() that is new TinyDB(getApplicationContext());


Before you can use the save objects methods, you must first

Download [Gson.jar][1]

Place the Gson.jar file into your projects "libs" folder (create one if you dont already have the folder)

Uncomment the save objects methods in your copy of TinyDB.java, starting at: [Line31][6], [Line317][2], [Line332][3], [Line462][4], [Line468][5]
[1]: http://search.maven.org/#artifactdetails%7Ccom.google.code.gson%7Cgson%7C2.4%7Cjar [2]: