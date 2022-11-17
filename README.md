### Premium

Premium is a proof-of-concept Android app designed to display information about The English Premier League.

---------

## Table of contents

- [Features](#features)
- [Installation](#Installation)
- [Implementation Details](#implementation-details)
- [API](#api)
- [App Architecture](#app-architecture)
- [Preview](#preview)
- [License](#license)

---------

## Features

- User can browse a screen that displays a list of upcoming Premier League fixtures sectioned by day.
- Each fixture displays the two teams names and the game result or the time of
  the game (if it’s not played yet).
- User can toggle the list view to display the fixtures by (Upcoming fixtures/All season fixtures)
- User can click on a specific fixture to add it to his favourite list.
- User can navigate to another screen the displays a list of persisted previously favourites fixtures.
- App monitors network connectivity and error handling.

--------

## Installation

Clone this repository and import into **Android Studio**
```bash
git clone git@github.com:MhmoudAlim/Premium.git
```

### `Demo`

Download App Apk : [Premium](https://github.com/MhmoudAlim/Premium/raw/master/app/release/app-release.apk)

------

## Implementation Details

### `Layout`
-The app interface is implemented by declarative UI using Jetpack Compose


### `Permission`
-The App requires runtime permissions of
* **INTERNET**
* **ACCESS_NETWORK_STATE**



### `Data`
-The app uses Rest Api to fetch data from a remote Api.
<br/>
-The app uses Room database to save user selected favourite matches.


### `Error Handling`
-The performed requests handle successful results, failure results and no internet connection


### `Testing`

#### - **Local Tests**

* Unit test for application use-cases with fake repo and data sources.
* Unit test for app repo Api using mockWebServer and Android mockk

#### - **Instrumented Tests**
* Integration test for application Database and Dao.
* End-to-End test for user add fixture to favourite scenario.



### `Technologies used`

- Kotlin
- Clean Architecture
- MVVM pattern
- Repository Pattern
- Observer Pattern
- UDF pattern
- Kotlin Dsl Gradle
- Dependency Injection using Dagger Hilt
- Unit tests
- Integration tests
- End-to-end tests
- Kotlin Coroutines
- Kotlin Flow
- Android Jetpack
- Android-KTX
- Room Database
- Navigation Component
- Jetpack Compose
- Retrofit & OkHttp
- Moshi
- Java ThreeTen

<br/>

---------

## Api

- [Football Data](https://api.football-data.org/)

---------

## App Architecture
<br/>


<img src="https://github.com/MhmoudAlim/Premium/blob/master/blob/app_arch.png?raw=true" alt="Unidirectional Data Flow" width="400"/>


<br/>
<br/>
<br/>


### Application data Flow
<br/>

<img src="https://github.com/MhmoudAlim/Premium/blob/master/blob/architecture.png?raw=true" alt="Data Flow" height="300"/>


<br/>
<br/>
<br/>

### Why Clean Archetype ?

- Clean, Testable, Maintainable and extendable Codebase
- Apply high cohesion and low coupling
- Apply Separation of concerns principle
- Apply Single source of truth principle
- Fine-grained dependency control.
- Improve re-usability across other apps.
- Improves the ownership & the quality of the codebase.

<br/>

---------


## Preview

|                                                1                                                |                                           2                                           |
|:-----------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------:|
| ![screenshot](https://github.com/MhmoudAlim/Premium/blob/master/blob/Screenshot_1.jpg?raw=true) | ![](https://github.com/MhmoudAlim/Premium/blob/master/blob/Screenshot_2.jpg?raw=true) |
| ![screenshot](https://github.com/MhmoudAlim/Premium/blob/master/blob/Screenshot_3.jpg?raw=true) | ![](https://github.com/MhmoudAlim/Premium/blob/master/blob/Screenshot_4.jpg?raw=true) |




---------


### License

<details>
    <summary>
        Click to reveal License
    </summary>

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

</details>
