# Mobile App

App Requirements
Write a sample app that fetches and displays data from a RESTful Web API.
The app should be able to display the data as a text only, scrollable list of titles, and on phones, should be toggle-able from the list to a
scrollable grid of item images.
The title and description for each item should each be parsed out of the data in the "Text" field. Images should be loaded from the URLs
in the "Icon" field. For items with blank or missing image URLs, use a placeholder image of your choice.
Clicking on an item should load a Detail view, including the item’s image, title, and description. You choose the layout of the Detail view.
On tablets, the app should show the list and detail views on the same screen. For phones, the list and detail should each be full screen.
The app should have an tool-bar that displays:
For Phone
The name of the app on the item list screen, and the title of the item on the detail screen
For Tablets
The name of the app

## Getting Started

Clone project from: https://github.com/jitzian/SimpsonsAndTheWire.git

### Prerequisites

Nothing, just follow the code

--
### Screenshots
![alt text](/screenshots/packageName.png "Package Name")
![alt text](/screenshots/flavorDimensions.png "Flavor Dimensions")
![alt text](/screenshots/noConnectivityScenario.png "Offline Error Handling")

### Technologies
Kotlin: Because.... Kotlin is just perfect!!!! 

Dagger 2: For allowing dependency injection. In this case for injecting Network related features (Retrofit).
Retrofit 2 and Gson Converter: Pretty familiar with this 2 libraries. 
MVVM Pattern: Decoupling business logic from the views and keep them as dummy as possible is the best way of 
developing apps.
ViewModel: Part of the MVVM design pattern.
Persistence: Room2. We have to keep things fancy and give a seamless experience to users. Why to waste user's data
if we already have gotten what we need? Why not to store data that will be reused?. For those reasons, I've choosen 
Room Db.    
Live Data: Let's support data changes and reflect them on UI in a very seamless way.
Kotlin Coroutines: Background threading? RXJava is cool, and fancy, but at the end it is a dependency. Coroutines are 
super fancy, super readable and light weight threads.  


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Coffee

