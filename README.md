# DYNAMIT: MOBILE DEVELOPER CODE PROMPT

Write a native app (iOS or Android) that consumes data from from the open air quality API
( https://docs.openaq.org/ ) and displays it to the screen.
Display a listing of the city names and number of measurements that are available for that city. Do
not show any cities that have less than 10,000 measurements. The listing should be sorted
descending by number of measurements. The app should use the most efficient way possible to
filter and sort the data.
Along with a display for the list, a user should be able to tap one of the locations and open a
detail view that includes additional information about the location/measurement.
Additionally, the app should be able to handle connectivity issues gracefully

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

