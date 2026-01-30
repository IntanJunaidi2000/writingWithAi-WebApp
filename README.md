# Vis - writing web app ~~writingWithAi-WebApp~~
Vision: A simple, distraction-free writing app for authors with and without AI assistance

# Target Users
| User Type | Description |
| -------- | -------- |
| Guest Writer | no account, local storage only |
| Registered Writer    | cloud database & sync, multiple projects |


# Requirements
1. Primary writing interface
2. Secondary reference panel
3. MD editing functions
4. AI chat integration
5. AI comments/feedback feature
6. Export to docx/pdf
7. Host on Mobile

# User Stories + Acceptance Criteria Template:
AS A [user type]
I WANT TO [action]
SO THAT [benefit]

Acceptance Criteria:
- [ ] Specific testable condition 1
- [ ] Specific testable condition 2
  

# Tech Stack
Backend:  Spring Boot + MySQL (cloud)
Frontend: React (builds to Progressive Web App "PWA" )
Hosting:  Railway / Render (free tiers)

-> Railway (Trial: $5 free credit, probably $0-3/month on Hobby plan)
-> Render (Free web services spin down after 15 minutes of inactivity, causing a delay on the next request.)

## Core Features (MVP)

### Phase 1 - Backend Foundation
| Feature | Priority | Notes |
|---------|----------|-------|
| MySQL database setup | Must | Local MySQL |
| Spring Boot project setup | Must | Basic MVC architecture |
| User & Document entities | Must | Based on ERD |
| Basic CRUD API | Must | Create, Read, Update, Delete |

### Phase 2 - Backend Authentication
| Feature | Priority | Notes |
|---------|----------|-------|
| Spring Security setup | Must | Add back dependency |
| User registration | Must | Create account |
| User login/logout | Must | JWT or session |

### Phase 3 - Frontend Editor
| Feature | Priority | Notes |
|---------|----------|-------|
| Guest mode (no login) | Must | Local storage only |
| Primary editor panel | Must | Main writing area |
| Reference panel (side) | Must | View second file read-only |
| Create/edit MD files | Must | Basic markdown |
| MD preview toggle | Should | See formatted output |
| Local auto-save | Must | Browser storage |
| Basic formatting toolbar | Should | Bold, italic, headers, etc |

### Phase 4 - Integration
| Feature | Priority | Notes |
|---------|----------|-------|
| Connect frontend to backend | Must | API calls |
| Cloud & local sync | Must | Backup/restore files |
| File browser (folders) | Must | Organize projects + filtering |

### Phase 5 - Additional Features
| Feature | Priority | Notes |
|---------|----------|-------|
| Export to DOCX | Must | Novel/manuscript format |
| Export to PDF | Should | Print-ready |
| Format preferences | Should | Font, margins, etc |
| API key input (user's own) | Must | Stored securely |
| AI chat panel | Must | Ask questions, get help |
| AI comments in document | Should | Inline feedback |

---

### Tech Stack

| Layer | Technology |
|-------|------------|
| Backend | Spring Boot (Java) |
| Database | MySQL (Railway or PlanetScale) |
| Frontend | React |
| Auth | Spring Security + JWT |
| AI | Claude API (user's key) - should work on any API |
| Hosting | Railway (later) |

-> Railway (Trial: $5 free credit, probably $0-3/month on Hobby plan)
-> Render (Free web services spin down after 15 minutes of inactivity, causing a delay on the next request.)

---

Full ERD Structure

<img width="623" height="376" alt="WritingApp" src="https://github.com/user-attachments/assets/42dab6fa-ff6a-4044-b3e1-848dd5004a36" />


USER
├── id (PK)
├── username
├── email
├── password
~~├── api_key (nullable, encrypted)~~ (implement later)
├── created_at

~~PROJECT 
├── id (PK)
├── name
├── user_id (FK) → USER
├── parent_id (FK) → PROJECT (nullable)
├── created_at~~ (implement later)

DOCUMENT
├── id (PK)
├── title
├── content (LONGTEXT)
├── user_id (FK) → USER
~~├── project_id (FK) → PROJECT (nullable)~~ (implement later)
├── created_at
├── updated_at

~~AI_COMMENT 
├── id (PK)
├── document_id (FK) → DOCUMENT
├── line_number (where in doc)
├── comment_text
├── comment_type (grammar/style/plot/suggestion)
├── is_resolved (boolean)
├── created_at~~(implement Later)

~~EXPORT_PRESET
├── id (PK)
├── user_id (FK) → USER
├── preset_name
├── font_family
├── font_size
├── margin_size
├── line_spacing
├── is_default (boolean)
├── created_at~~ (implement Later)

~~USER (1) (many) PROJECT~~ (implement later)
USER (1) (many) DOCUMENT
~~USER (1) (many) EXPORT_PRESET~~ (implement later)

~~PROJECT (1) (many) PROJECT (self-reference)~~ (implement later)
~~PROJECT (1) (many) DOCUMENT (optional)~~ (implement later)

~~DOCUMENT (1) (many) AI_COMMENT~~ (implement later)

---

### User Stories (Examples)

```
US-001: Guest Writing
AS A guest user
I WANT TO write without creating an account
SO THAT I can try the app quickly

Acceptance Criteria:
- [ ] Can access editor without login
- [ ] Files save to browser local storage
- [ ] Banner shows "Login to sync to cloud"
```

```
US-002: Cloud Sync
AS A registered user
I WANT TO access my files from any device
SO THAT I can write anywhere

Acceptance Criteria:
- [ ] Files sync to cloud on save
- [ ] Can see all files when logged in elsewhere
- [ ] Offline changes sync when back online
```
