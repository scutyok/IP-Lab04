=====================
# C4 Container Diagram
=====================
## System
The Device Driver Management and Communication System is decomposed into multiple containers, each one having a clearly defined responsibility in the overall management of devices, drivers and system communication.

## Description
At this level, the system is no longer viewed as a single unit, but as a set of major internal building blocks. These containers collaborate in order to provide driver installation, update, communication and local storage functionalities.

=====================
## Main Containers
=====================
### Desktop Application / Admin & User Interface
This container represents the interface through which the user and the administrator interact with the system. It allows the administrator to configure devices, install or update drivers and monitor system status. It also allows the user to view whether the connected device is functional and to receive feedback from the system.

### Driver Management Service
This container is responsible for the main driver-related operations. It handles device detection, driver search, compatibility verification, driver download, installation and update operations.

### Device Communication Service
This container manages the communication between the physical device and the operating system. It receives raw signals from the device, translates them into messages that the operating system can understand and may also transmit commands from the operating system back to the device.

### Local Driver Store / Configuration Storage
This container stores local data needed by the system, including installed drivers, configuration files, metadata and logs related to system activity and possible errors.

=====================
## External Systems
=====================
### Operating System
The operating system interacts with the internal services in order to register installed drivers, execute commands and process translated input received from the communication service.

### Physical Device
The physical device exchanges signals with the communication service. It sends raw hardware data to the system and may also receive output commands when necessary.

### Online Driver Repository
The online driver repository is used by the driver management service to search for, download and update the software drivers required by a given device.

=====================
## Relationships
=====================

> The **User** and the **Administrator** interact with the **Desktop Application / Admin & User Interface**.
> The **Desktop Application / Admin & User Interface** sends driver-related requests to the **Driver Management Service**.
> The **Desktop Application / Admin & User Interface** receives device status and feedback from the **Device Communication Service**.
> The **Driver Management Service** communicates with the **Operating System** to register and configure drivers.
> The **Driver Management Service** accesses the **Online Driver Repository** in order to search for and download the required drivers.
> The **Driver Management Service** stores driver-related data and logs in the **Local Driver Store / Configuration Storage**.
> The **Device Communication Service** exchanges signals with the **Physical Device**.
> The **Device Communication Service** communicates with the **Operating System** by translating hardware signals into system-understandable messages.
> The **Device Communication Service** may use stored information from the **Local Driver Store / Configuration Storage** when needed.
