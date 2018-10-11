class Account {
action AccountsController__auto_complete {
  at__auto_complete = empty
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__query = empty
  if (*) {
    at__auto_complete = subset(Account)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action AccountsController__contacts {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
}
action AccountsController__create {
  at__account = create Account
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__comment_body = empty
}
action AccountsController__destroy {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  delete(at__account.account_contacts)
  delete(at__account.account_opportunities)
  delete(at__account)
}
action AccountsController__edit {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
}
action AccountsController__filter {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__accounts = subset(Account)
}
action AccountsController__index {
  at__current_tab = empty
  at__accounts = subset(Account)
  assert ((inusergroup(admin) and at__accounts in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__accounts in union(Account, currentuser.accounts)))
  at__account_category_total = empty
  at__accounts = subset(at__accounts)
}
action AccountsController__new {
  at__account = create Account
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__account.user = currentuser
  at__account.assignee = empty
}
action AccountsController__opportunities {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
}
action AccountsController__redraw {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__accounts = subset(Account)
}
action AccountsController__show {
  at__current_tab = empty
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
  at__stage = empty
  at__comment = create Comment
  at__timeline = empty
}
action AccountsController__update {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
}
action AccountsController__versions {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in union(Account, currentuser.accounts)) or (inusergroup(nonadmin) and at__account in union(Account, currentuser.accounts)))
}
}
class AccountContact {


action AuthenticationsController__create {
  raise
  at__authentication = empty
}
action AuthenticationsController__destroy {}
action AuthenticationsController__new {
  raise
  at__authentication = empty
}
action AuthenticationsController__show {
  raise
}
action AuthenticationsController__update {
  raise
}
}
class AccountOpportunity {

}
class ActsAsTaggableOn_Tag {

}
class ActsAsTaggableOn_Tagging {

}
class Address {
}
class Avatar {

}
class Campaign {
action CampaignsController__auto_complete {
  at__auto_complete = empty
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
  at__query = empty
  if (*) {
    at__auto_complete = subset(Campaign)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action CampaignsController__create {
  at__campaign = create Campaign
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
  at__comment_body = empty
}
action CampaignsController__destroy {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
  delete(at__campaign.leads)
  delete(at__campaign.opportunities.account_opportunity)
  delete(at__campaign.opportunities.contact_opportunities)
  delete(at__campaign.opportunities)
  delete(at__campaign)
}
action CampaignsController__edit {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__filter {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
  at__campaigns = subset(Campaign)
}
action CampaignsController__index {
  at__current_tab = empty
  at__campaigns = subset(Campaign)
  assert ((inusergroup(admin) and at__campaigns in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaigns in union(Campaign, currentuser.campaigns)))
  at__campaign_status_total = empty
  at__campaigns = subset(at__campaigns)
}
action CampaignsController__leads {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__new {
  at__campaign = create Campaign
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__opportunities {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__redraw {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
  at__campaigns = subset(Campaign)
}
action CampaignsController__show {
  at__current_tab = empty
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__update {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
action CampaignsController__versions {
  at__campaign = oneof(Campaign)
  assert ((inusergroup(admin) and at__campaign in union(Campaign, currentuser.campaigns)) or (inusergroup(nonadmin) and at__campaign in union(Campaign, currentuser.campaigns)))
}
}
class Comment {

}
class Contact {
action ContactsController__auto_complete {
  at__auto_complete = empty
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__query = empty
  if (*) {
    at__auto_complete = subset(Contact)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action ContactsController__create {
  at__contact = create Contact
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__accounts = subset(Account)
  at__comment_body = empty
}
action ContactsController__destroy {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  delete(at__contact.account_contact)
  delete(at__contact.contact_opportunities)
  delete(at__contact)
}
action ContactsController__edit {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__accounts = subset(Account)
  at__account = at__contact.account_contact.account
}
action ContactsController__index {
  at__current_tab = empty
  at__contacts = subset(Contact)
  assert ((inusergroup(admin) and at__contacts in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contacts in union(Contact, currentuser.contacts)))
  at__contacts = subset(at__contacts)
}
action ContactsController__new {
  at__contact = create Contact
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__accounts = subset(Account)
  at__account = create Account
}
action ContactsController__opportunities {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
}
action ContactsController__redraw {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__contacts = subset(Contact)
}
action ContactsController__show {
  at__current_tab = empty
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__stage = empty
  at__comment = create Comment
  at__timeline = empty
}
action ContactsController__update {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
  at__accounts = subset(Account)
}
action ContactsController__versions {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in union(Contact, currentuser.contacts)) or (inusergroup(nonadmin) and at__contact in union(Contact, currentuser.contacts)))
}
}
class ContactOpportunity {

}
class CoreField extends Field {
}
class CustomField extends Field {
}
class CustomFieldDatePair extends CustomFieldPair {
}
class CustomFieldDatetimePair extends CustomFieldDatePair {
}
class CustomFieldPair extends CustomField {

}
class Email {
  action EmailsController__destroy {
    at__email = oneof(Email)
    delete(at__email)
  }

}
class Field {
action HomeController__index {
  at__current_tab = empty
  at__activities = empty
  at__my_tasks = subset(Task)
  at__my_opportunities = subset(Opportunity)
  at__my_accounts = subset(Account)
}
action HomeController__options {
  at__asset = empty
  at__action = empty
  at__user = empty
  at__duration = empty
  at__all_users = empty
  if (*) {
    at__asset = empty
    at__action = empty
    at__user = empty
    at__duration = empty
    at__all_users = User
  }
}
action HomeController__redraw {
  at__activities = empty
}
action HomeController__toggle {}
}
class FieldGroup {

}
class Group {
action Admin_GroupsController__create {
  at__group = create Group
}
action Admin_GroupsController__destroy {
  at__group = oneof(Group)
  delete(at__group)
}
action Admin_GroupsController__edit {
  at__group = oneof(Group)
}
action Admin_GroupsController__index {
  at__current_tab = empty
  at__groups = subset(Group)
}
action Admin_GroupsController__new {
  at__group = create Group
}
action Admin_GroupsController__show {
  at__current_tab = empty
  at__group = oneof(Group)
}
action Admin_GroupsController__update {
  at__group = oneof(Group)
}
}
class Lead {
action LeadsController__auto_complete {
  at__auto_complete = empty
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__query = empty
  if (*) {
    at__auto_complete = subset(Lead)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action LeadsController__autocomplete_account_name {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
}
action LeadsController__convert {
  at__previous = empty
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__account = create Account
  at__accounts = subset(Account)
  at__opportunity = create Opportunity
  if (*) {
    at__previous = oneof(Lead)
  }
}
action LeadsController__create {
  at__lead = create Lead
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__campaigns = subset(Campaign)
  at__comment_body = empty
}
action LeadsController__destroy {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  delete(at__lead)
}
action LeadsController__edit {
  at__previous = empty
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__campaigns = subset(Campaign)
  if (*) {
    at__previous = oneof(Lead)
  }
}
action LeadsController__filter {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__leads = subset(Lead)
}
action LeadsController__index {
  at__current_tab = empty
  at__leads = subset(Lead)
  assert ((inusergroup(admin) and at__leads in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__leads in union(Lead, currentuser.leads)))
  at__leads = subset(at__leads)
}
action LeadsController__new {
  at__lead = create Lead
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__campaigns = subset(Campaign)
}
action LeadsController__promote {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__account = empty
  at__opportunity = empty
  at__contact = empty
  at__accounts = subset(Account)
  at__stage = empty
}
action LeadsController__redraw {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__leads = subset(Lead)
}
action LeadsController__reject {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
}
action LeadsController__show {
  at__current_tab = empty
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
  at__comment = create Comment
  at__timeline = empty
}
action LeadsController__update {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
}
action LeadsController__versions {
  at__lead = oneof(Lead)
  assert ((inusergroup(admin) and at__lead in union(Lead, currentuser.leads)) or (inusergroup(nonadmin) and at__lead in union(Lead, currentuser.leads)))
}
}
class List {
action ListsController__create {
  at__list = empty
  if (not isempty(at__list = tryoneof(List))) {
    true
  } else {
    at__list = create List
  }
   at__list = create List
}
action ListsController__destroy {
  at__list = oneof(List)
  delete(at__list)
}
}
class Opportunity {
action OpportunitiesController__auto_complete {
  at__auto_complete = empty
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__query = empty
  if (*) {
    at__auto_complete = subset(Opportunity)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action OpportunitiesController__contacts {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
}
action OpportunitiesController__create {
  at__opportunity = create Opportunity
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__comment_body = empty
}
action OpportunitiesController__destroy {
  at__account = empty
  at__campaign = empty
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  if (empty) {
    at__account = at__opportunity.account_opportunity.account
  } else {
    if (empty) {
      at__campaign = at__opportunity.campaign
    }
  }
  delete(at__opportunity.account_opportunity)
  delete(at__opportunity.contact_opportunities)
  delete(at__opportunity)
}
action OpportunitiesController__edit {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
}
action OpportunitiesController__filter {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__opportunities = subset(Opportunity)
}
action OpportunitiesController__index {
  at__current_tab = empty
  at__opportunities = subset(Opportunity)
  assert ((inusergroup(admin) and at__opportunities in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunities in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__opportunities = subset(at__opportunities)
}
action OpportunitiesController__new {
  at__opportunity = create Opportunity
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
}
action OpportunitiesController__redraw {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__opportunities = subset(Opportunity)
}
action OpportunitiesController__show {
  at__current_tab = empty
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
  at__comment = create Comment
  at__timeline = empty
}
action OpportunitiesController__update {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
}
action OpportunitiesController__versions {
  at__opportunity = oneof(Opportunity)
  assert ((inusergroup(admin) and at__opportunity in union(Opportunity, currentuser.opportunities)) or (inusergroup(nonadmin) and at__opportunity in union(Opportunity, currentuser.opportunities)))
  at__stage = empty
}
}
class PaperTrail_Version {
}
class Permission {

}
class Preference {

}
class Setting {
action Admin_SettingsController__index {
  at__current_tab = empty
}
action PasswordsController__create {
  raise
  at__user = oneof(User)
}
action PasswordsController__edit {
  at__user = empty
  raise
  raise
}
action PasswordsController__new {
  raise
}
action PasswordsController__update {
  at__user = empty
  raise
  raise
}

}
class Tag  {
action Admin_TagsController__confirm {
  at__tag = oneof(Tag)
}
action Admin_TagsController__create {
  at__tag = create Tag
}
action Admin_TagsController__destroy {
  at__tag = oneof(Tag)
  delete(at__tag.taggings)
  delete(at__tag)
}
action Admin_TagsController__edit {
  at__tag = oneof(Tag)
}
action Admin_TagsController__index {
  at__current_tab = empty
  at__tags = subset(Tag)
  at__tags = Tag
}
action Admin_TagsController__new {
  at__tag = create Tag
}
action Admin_TagsController__update {
  at__tag = oneof(Tag)
}
}
class Tagging extends ActsAsTaggableOn_Tagging {
}
class Task {
action TasksController__auto_complete {
  at__auto_complete = empty
  at__query = empty
  if (*) {
    at__auto_complete = subset(Task)
  } else {
    at__auto_complete = tryoneof(at__auto_complete)
  }
}
action TasksController__complete {
  at__view = empty
  at__task_total = empty
  at__empty_bucket = empty
  at__task = oneof(Task)
  if (empty) {
    at__empty_bucket = empty
  }
  if (*) {
    at__view = empty
    at__task_total = empty
    empty
  }
}
action TasksController__create {
  at__view = empty
  at__task = create Task
}
action TasksController__destroy {
  at__task_total = empty
  at__empty_bucket = empty
  at__view = empty
  at__task = oneof(Task)
  delete(at__task)
  if (empty) {
    at__empty_bucket = empty
  }
  if (empty) {
    at__view = empty
    at__task_total = empty
    empty
  }
}
action TasksController__edit {}
action TasksController__filter {
  at__view = empty
}
action TasksController__index {
  at__current_tab = empty
  at__view = empty
  at__task_total = empty
  at__tasks = empty
}
action TasksController__new {}
action TasksController__show {
  at__current_tab = empty
  at__task = oneof(Task)
}
action TasksController__uncomplete {
  at__empty_bucket = empty
  at__task = oneof(Task)
    at__empty_bucket = empty
  at__view = empty
  at__task_total = empty
}
action TasksController__update {
  at__view = empty
  at__task = oneof(Task)
  at__task_before_update = at__task
}
}
 class User {
action UsersController__auto_complete {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__avatar {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__change_password {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__create {
  at__user = create User
  assert ((inusergroup(admin) and at__user in union(User, currentuser)) or (inusergroup(nonadmin) and at__user in union(User, currentuser)))
}
action UsersController__edit {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__new {
  at__user = create User
  assert ((inusergroup(admin) and at__user in union(User, currentuser)) or (inusergroup(nonadmin) and at__user in union(User, currentuser)))
}
action UsersController__opportunities_overview {
  at__current_tab = empty
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__password {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__redraw {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__show {
  at__current_tab = empty
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
  if (*) {
    at__user = currentuser
  }
}
action UsersController__update {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
}
action UsersController__upload_avatar {
  at__user = oneof(User)
  assert ((inusergroup(admin) and at__user in union(currentuser, User)) or (inusergroup(nonadmin) and at__user in currentuser))
  if (*) {
    if (*) {
      create Avatar
      empty
    }
    empty
  }
}

}
class Version extends PaperTrail_Version {

}