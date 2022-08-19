# Parking-Lot Management System
#### The Desktop Application which provides parking-lot management solution.
---
## Features
-  Made with `Java` and Developed on **OOP** Paradigm.
- make use of `MySQL` Database on the basis of **RDBMS** to store parking history.
- The Java `Swing.JFrame` provides a **GUI** for maintaining & inspecting parking lot.

## Functionalities
- Parking lot have multiple **parking floors** where customers park their cars.
- Customers collect a **parking ticket** from the entry points and  pay the parking fee at the exit points on their way out.
- The parking charges is calculated according to each **distinct vehicle-type** charges per hour.
- Each parking floor have many **disticnt parking spots**. The system support multiple types of parking spots according to vehicle types _such as Car, Motorcycle, Van and Luxury_
- System enables admin to **overview each parking floor** by the help of GUI, showing  free parking spot as well as occupied parking spots.
- System keep records of Vehicle admitted, parked, and exited from Parking lot and show complete **parking-history**.

---

### UI Design
![system-login-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/login-UI.png)
The **Login** window enables admin to insert credentials and give access to use system after authentication being successful.

![dashboard-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/dashboard-UI.png)
The **Dashboard** window provides 4 major functionalities:
1) Admit vehicle to parking lot at entry time.
2) Remove Vehicle from parking lot while its leaving parking lot at exit.
3) Overview and inspect parking spots at parking floors.
4) Show parking History.

![admit-vehicle-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/admit-UI.png)
The **Admit Vehicle** Window takes vehicle ID number, Vehicle Type and Assign it a slot by inspecting available parking spot and generate new ticket for it.

![exit-vehicle-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/exit-UI.png)
The **Exit Vehicle** Window enables admin to insert Ticket Number and as check button is pressed the parking information is automatically rendered about vehicle which has assigned that ticket.

![GFlot-overview-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/overviewGF-UI.png)
![FFlot-overview-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/overviewFF-UI.png)
The **Overview** window displays with total, available, and unavailable number of spots on the floor. It has button to switch overview between different floors.
![FFlot-overviewaction-window](https://drive.google.com/file/d/1x1HnUYMdn-2rjAb9gRJ6C4kXzbskiblJ/view?usp=sharing)
this picture displays overview Window in Action.

![parking-history-window](https://github.com/code-nigar/Parking-Lot-Management-System/blob/master/resources/UI-Designs/history-UI.png)
The **History** window shows complete record of parking lot about vehicles parked, entered, and left.
![history-action-window](https://drive.google.com/file/d/1G-2yyXvHFuvOudU-njPJZtMf8vW96Cl0/view?usp=sharing)
this picture displays history Window in Action.

---
> Note: you may need to reconfigure the paths for sql database and use the appropriate version of mysql jdbc connector. Recommended IDE: Apache NetBeans IDE 12.0.
