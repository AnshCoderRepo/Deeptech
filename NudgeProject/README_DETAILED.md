# Nudge Project - Detailed Features

## Overview
This project is a Spring Boot application focused on managing "nudges" related to events. Nudges are notifications or reminders that users can create, customize, and schedule to be sent at specific times.

---

## Features

### Nudge Management
- Users can create, read, update, and delete nudges via RESTful API endpoints.
- Nudges are associated with events and include rich metadata to customize notifications.

#### Nudge Data Model
- **eventTag**: Tag to associate the nudge with a specific event.
- **title**: Title of the nudge.
- **coverImage**: Image uploaded by the user to serve as the cover for the nudge.
- **sendTime**: Date and time when the nudge should be sent.
- **description**: Detailed description of the nudge.
- **icon**: Icon image representing the nudge.
- **invitationLine**: A one-line invitation or teaser shown when the nudge is minimized or alongside related content.

#### Nudge API
- Base URL: `/api/nudges`
- Supports full CRUD operations:
  - **Create**: POST `/api/nudges` - Create a new nudge.
  - **Read**: GET `/api/nudges` - List all nudges.
  - **Read by ID**: GET `/api/nudges/{id}` - Get details of a specific nudge.
  - **Update**: PUT `/api/nudges/{id}` - Update an existing nudge.
  - **Delete**: DELETE `/api/nudges/{id}` - Remove a nudge.

- API documentation is available in the `Nudge_API_Documentation.md` file.

### Nudge Creation UI
- A beautiful, standalone web UI for creating nudges.
- Located at `src/main/resources/static/nudge-ui/index.html`.
- Features:
  - Form inputs for all nudge fields.
  - Image upload with live preview for cover image and icon.
  - Date-time picker for scheduling the send time.
  - Live preview of the one-line invitation.
  - Responsive and user-friendly design.

---

## How to Run
1. Build and run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
2. Access the nudge creation UI in your browser:
   ```
   http://localhost:8080/nudge-ui/index.html
   ```

---

## Future Enhancements
- Integrate the UI form with backend API endpoints for full CRUD functionality.
- Add authentication and user management.
- Implement notification delivery mechanisms for scheduled nudges.

---

## Contact
For questions or contributions, please contact the project maintainer.
