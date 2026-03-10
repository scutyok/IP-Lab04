=====================
# C4 Context Diagram
=====================
## System
This system is responsible for managing device-driver installation and updates, configuring devices and mediating communication between hardware devices and the operating system.

## Description
The chosen system models the interaction between users, administrators, hardware devices, the operating system and external driver sources. 

=====================
## Main Actors
=====================
### User
The user connects a physical device to the computer, either by cable or wirelessly, and then interacts with it by sending input or receiving feedback. 

### Administrator
The administrator is responsible for configuring the device in the operating system and managing the required drivers. This includes searching for the correct driver, downloading it, installing it and updating it when necessary.

=====================
## External Systems
=====================
### Operating System
The operating system receives translated messages from the driver-management system and sends commands back when needed. 

### Physical Device
The physical device is the hardware component that sends raw signals to the system. 

### Online Driver Repository
The online driver repository is an external source from which drivers can be searched, downloaded and updated.

=====================
## Relationships
=====================

> The **User** interacts with the system by connecting and using the device.
> The **Administrator** interacts with the system to configure devices and manage drivers.
> The system communicates with the **Operating System** to register devices, exchange translated messages and support device usage.
> The system receives hardware signals from the **Physical Device** and may transmit commands back to it.
> The system accesses the **Online Driver Repository** in order to search for and download compatible drivers.
