#Project 1 technical requirements:
## AWS RDS database (PostgreSQL)
#   Backend
##    Hibernate 
##    Java
##    Servlets
#   Frontend
##    HTML 
##    JavaScript
##    CSS

#User stories 

#Stories
	Novels are worth 50 points
	Novellas are worth 25 points
	Short stories are worth 20 points
	Articles are worth 10 points 
	
	A story must have 
		basic author information 
			First name 
			Last Name
		A proposed title 
		An estimated completion date
		Story type (calculated based on length ?)
			Article < 10 pages
			Short story < 25 pages
			Novella < 50 pages
			Novel >= 50 pages
		Genre
		Tag Line
		Detailed Description 
		Story must all for Optional attatchment images, pdf, .msg(time permitting)
		a field showing if they have enough points for submission or 
			if the story will go into queue
	Types will determine final approval process (JAVA logic)
	Types must be pulled from a reference table 
		ID
		TYPE
		POINT VALUE
	Genres will affect which editors will review the pitch
	Genres must be pulled from a referance table 
		ID
		TYPE
	Story pitches must have an approval status 
		On hold
		Pending Level 1 Approval
		Pending Level 2 Approval
		Pending Level 3 Approval
		Revised - pending Author reapproval
	Stories must have a priority level
		Normal 
		High Priority
	Date Submitted
	Must recent approval date
	Must have the person who approved it 
		
		
			
	

#Authors
	Authors can submit multiple story pitches 
	Authors can submit up to 100 points worth of stories 
	The author can add stories to their queue
	If an author is rejected the book is removed from their active queue
	If an author submits a story that would exceed their alloted points
		the story will go into a seperate holding queue
	The author may resubit stories from their holding queue
	The author can view the draft they submitted
	
	
#Assistant Editor
	The assistant belongs to at least one genre committe
	The assistant has at least 1 genre specialty
	The assistant can have more than 1 genre
	The assistant can approve a pitch only in their genre
	The assistant can deny a pitch only in their genre
	The assistant must provide a reason for denying a pitch
	The assistant can request more information from author BEFORE 
		approving or rejecting 
	If the Assisstant takes too long ( time > 1 week) on a pitch
		the pitch will change to high priority 
	The assisstant MUST be accepted or rejected before their 
		other pitches can be reviewed
	If there is no assistant editor in the genre, the pitch will be 
		auto matically approved to the next level 
	The assistant editor can view drafts that belong to a genre 
		that they committee

#General Editor
	
	The General Editor belongs to at least one genre committe
	The General Editor has at least 1 genre specialty
	The General Editor can have more than 1 genre
	The General Editor can approve a pitch 
	The General Editor can deny a pitch 
	The General Editor must provide a reason to the author for denying a pitch
	
	The General Editor can request more information from author BEFORE 
		approving or rejecting 
	OR
	
	The General Editor can request more information from assistant BEFORE 
	approving or rejecting 
	
	If the General Editor takes too long ( time > 1 week) on a pitch
		the pitch will change to high priority 
	The General Editor MUST be accepted or rejected before their 
		other pitches can be reviewed
		
	The general editor can view drafts of pitches they've approved
	

#Senior Editor
	The Senior Editor belongs to at least one genre committe
	The Senior Editor has at least 1 genre specialty
	The Senior Editor can have more than 1 genre
	The Senior Editor can approve a pitch only from the genre they're in
	The Senior Editor can deny a pitch only from the genre they're in
	The Senior Editor must provide a reason to the author for denying a pitch
	
	The senior editor can request information from anyone who approved it
	The Senior Editor can request more information from assistant BEFORE 
		approving or rejecting 
	OR
	
	The Senior Editor can request more information from the general editor BEFORE  approving or rejecting 
	
	If the Senior Editor takes too long ( time > 1 week) on a pitch
		the pitch will change to high priority 
	
		
	The senior editor can change 
		the title 
		tag line
		completion date 
	If the senior editor changes anything the author must the reapprove 
		or reject the work
		
	The senior editor can view drafts that belong to a genre 
	that they committee

#Draft submission
	Once the pitch is approved the author must submit a completed draft
	If any changes are requested the author will be notified
	If any changes are requested the author will have to resubmit an
		updated draft
	The draft will be proofread and approved 
		Articles 
			Senior editor approval
		Short stories
			Senior editor approval
			one other editor, same genre
		Novellas / Novels
			Majority Approval of editors in genre
	
		

#Genre committees
	Each genre committee will have and odd number of editors, at least 5 editors including one Senior editor.
	Each genre committee must have at least 3 editors AND 1 Senior editor 
	Each genre committee must have 1 senior editor
	Each genre committee must not have more than 2 senior editors 
	Each genre committee must have at least 1 General editor 
	The review draft will only be visible to 
		The author 
		Members of the relevant genre committee 
		The general Editor (cross genre) who approved the pitch
	
	