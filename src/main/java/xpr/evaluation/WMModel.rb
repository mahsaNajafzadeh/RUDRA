class Account {
action AboutController__index {}
action AccountsController__add_tag {
  at__tag = empty
  at__account = oneof(Account)
  assert (((inusergroup(admin) and at__account in Account) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  if ((((inusergroup(admin) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
    at__tag = oneof(Tag)
    at__account.tags += at__tag
    empty
  } else {
    false
  }
}
action AccountsController__create {
  at__account = create Account
  assert ((((inusergroup(admin) and at__account in Account) or (inusergroup(restricted_user) and at__account in Account)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  at__account.author_user = currentuser
  if (*) {
    tag = oneof(Tag)
    at__account.tags += tag
  } else {
    at__account.tags -= empty
  }
}
action AccountsController__destroy {
  at__account = oneof(Account)
  assert ((inusergroup(admin) and at__account in Account) or (inusergroup(super_user) and at__account in Account))
  delete(at__account.contacts.aliases)
  delete(at__account.contacts)
  delete(at__account.opportunities.opportunity_attachments)
  delete(at__account.opportunities)
  delete(at__account.quotations.quotation_lines)
  delete(at__account.quotations.quotation_attachments)
  delete(at__account.quotations)
  delete(at__account.events.event_attachments)
  delete(at__account.events)
  delete(at__account.tasks.task_attachments)
  delete(at__account.tasks)
  delete(at__account.documents.document_attachments)
  delete(at__account.documents)
  delete(at__account.contracts.contract_attachments)
  delete(at__account.contracts)
  delete(at__account)
}
action AccountsController__edit {
  at__account = oneof(Account)
  assert ((((inusergroup(admin) and at__account in Account) or (inusergroup(restricted_user) and at__account in currentuser.accounts)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  at__users = subset(User)
}
action AccountsController__index {
  at__accounts = subset(Account)
  assert (((((inusergroup(admin) and at__accounts in Account) or (inusergroup(readonly_user) and at__accounts in Account)) or (inusergroup(restricted_user) and at__accounts in Account)) or (inusergroup(user) and at__accounts in Account)) or (inusergroup(super_user) and at__accounts in Account))
  at__setting = tryoneof(Setting)
  at__autocomplete_accounts = empty
  at__autocomplete_contacts = empty
}
action AccountsController__new {
  at__account = create Account
  assert ((((inusergroup(admin) and at__account in Account) or (inusergroup(restricted_user) and at__account in Account)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  at__account.user = currentuser
  at__users = subset(User)
}
action AccountsController__search {
  at__accounts = empty
  at__elements = empty
  at__response = empty
  at__account = oneof(Account)
  assert (((((inusergroup(admin) and at__account in Account) or (inusergroup(readonly_user) and at__account in Account)) or (inusergroup(restricted_user) and at__account in Account)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  at__setting = tryoneof(Setting)
  if (*) {
    if (*) {
      at__elements = empty
      at__response = empty
    } else {
      at__accounts = subset(Account)
    }
    empty
  }
}
action AccountsController__show {
  at__account = oneof(Account)
  assert (((((inusergroup(admin) and at__account in Account) or (inusergroup(readonly_user) and at__account in Account)) or (inusergroup(restricted_user) and at__account in Account)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  assert ((((inusergroup(admin) or inusergroup(readonly_user)) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))
}
action AccountsController__update {
  at__account = oneof(Account)
  assert ((((inusergroup(admin) and at__account in Account) or (inusergroup(restricted_user) and at__account in currentuser.accounts)) or (inusergroup(user) and at__account in Account)) or (inusergroup(super_user) and at__account in Account))
  at__account.editor_user = currentuser
  if (*) {
    tag = oneof(Tag)
    at__account.tags += tag
  } else {
    at__account.tags -= empty
  }
}
}
class Activity {
action ActivitiesController__create {
  at__activity = create Activity
  assert ((inusergroup(admin) and at__activity in Activity) or (inusergroup(super_user) and at__activity in Activity))
  at__activity.author_user = currentuser
}
action ActivitiesController__destroy {
  at__activity = oneof(Activity)
  assert ((inusergroup(admin) and at__activity in Activity) or (inusergroup(super_user) and at__activity in Activity))
  delete(at__activity)
}
action ActivitiesController__edit {
  at__activity = oneof(Activity)
  assert ((inusergroup(admin) and at__activity in Activity) or (inusergroup(super_user) and at__activity in Activity))
}
action ActivitiesController__index {
  at__activities = subset(Activity)
  assert ((((inusergroup(admin) and at__activities in Activity) or (inusergroup(readonly_user) and at__activities in Activity)) or (inusergroup(user) and at__activities in Activity)) or (inusergroup(super_user) and at__activities in Activity))
}
action ActivitiesController__new {
  at__activity = create Activity
  assert ((inusergroup(admin) and at__activity in Activity) or (inusergroup(super_user) and at__activity in Activity))
}
action ActivitiesController__update {
  at__activity = oneof(Activity)
  assert ((inusergroup(admin) and at__activity in Activity) or (inusergroup(super_user) and at__activity in Activity))
  at__activity.editor_user = currentuser
}

}
class Alias {
action AttachmentsController__destroy {}
}
class Anomaly {
}
class Campaign {
action CampaignsController__create {
  at__campaign = create Campaign
  assert ((((inusergroup(admin) and at__campaign in Campaign) or (inusergroup(restricted_user) and at__campaign in Campaign)) or (inusergroup(user) and at__campaign in Campaign)) or (inusergroup(super_user) and at__campaign in Campaign))
  at__campaign.author_user = currentuser
}
action CampaignsController__destroy {
  at__campaign = oneof(Campaign)
  assert (((inusergroup(admin) and at__campaign in Campaign) or (inusergroup(user) and at__campaign in Campaign)) or (inusergroup(super_user) and at__campaign in Campaign))
}
action CampaignsController__edit {
  at__campaign = oneof(Campaign)
  assert ((((inusergroup(admin) and at__campaign in Campaign) or (inusergroup(restricted_user) and at__campaign in Campaign)) or (inusergroup(user) and at__campaign in Campaign)) or (inusergroup(super_user) and at__campaign in Campaign))
}
action CampaignsController__index {
  at__campaigns = subset(Campaign)
  assert (((((inusergroup(admin) and at__campaigns in Campaign) or (inusergroup(readonly_user) and at__campaigns in Campaign)) or (inusergroup(restricted_user) and at__campaigns in Campaign)) or (inusergroup(user) and at__campaigns in Campaign)) or (inusergroup(super_user) and at__campaigns in Campaign))
}
action CampaignsController__new {
  at__campaign = create Campaign
  assert ((((inusergroup(admin) and at__campaign in Campaign) or (inusergroup(restricted_user) and at__campaign in Campaign)) or (inusergroup(user) and at__campaign in Campaign)) or (inusergroup(super_user) and at__campaign in Campaign))
}
action CampaignsController__update {
  at__campaign = oneof(Campaign)
  assert ((((inusergroup(admin) and at__campaign in Campaign) or (inusergroup(restricted_user) and at__campaign in Campaign)) or (inusergroup(user) and at__campaign in Campaign)) or (inusergroup(super_user) and at__campaign in Campaign))
  at__campaign.editor_user = currentuser
}

}
class CampaignCompletedStage {
action CampaignCompletedStagesController__destroy {
  at__campaign_completed_stage = oneof(CampaignCompletedStage)
  assert ((inusergroup(admin) and at__campaign_completed_stage in CampaignCompletedStage) or (inusergroup(super_user) and at__campaign_completed_stage in CampaignCompletedStage))
  delete(at__campaign_completed_stage)
}
action CampaignCompletedStagesController__edit {
  at__campaign_completed_stage = oneof(CampaignCompletedStage)
  assert ((inusergroup(admin) and at__campaign_completed_stage in CampaignCompletedStage) or (inusergroup(super_user) and at__campaign_completed_stage in CampaignCompletedStage))
}
action CampaignCompletedStagesController__index {
  at__campaign_completed_stages = subset(CampaignCompletedStage)
  assert (((inusergroup(admin) and at__campaign_completed_stages in CampaignCompletedStage) or (inusergroup(readonly_user) and at__campaign_completed_stages in CampaignCompletedStage)) or (inusergroup(super_user) and at__campaign_completed_stages in CampaignCompletedStage))
}
action CampaignCompletedStagesController__new {
  at__campaign_completed_stage = create CampaignCompletedStage
  assert ((inusergroup(admin) and at__campaign_completed_stage in CampaignCompletedStage) or (inusergroup(super_user) and at__campaign_completed_stage in CampaignCompletedStage))
}
action CampaignCompletedStagesController__update {
  at__campaign_completed_stage = oneof(CampaignCompletedStage)
  assert ((inusergroup(admin) and at__campaign_completed_stage in CampaignCompletedStage) or (inusergroup(super_user) and at__campaign_completed_stage in CampaignCompletedStage))
  at__campaign_completed_stage.editor_user = currentuser
}
}
class CampaignLine {

}
class CampaignResultStage {
action CampaignResultStagesController__create {
  at__campaign_result_stage = create CampaignResultStage
  assert ((inusergroup(admin) and at__campaign_result_stage in CampaignResultStage) or (inusergroup(super_user) and at__campaign_result_stage in CampaignResultStage))
  at__campaign_result_stage.author_user = currentuser
}
action CampaignResultStagesController__destroy {
  at__campaign_result_stage = oneof(CampaignResultStage)
  assert ((inusergroup(admin) and at__campaign_result_stage in CampaignResultStage) or (inusergroup(super_user) and at__campaign_result_stage in CampaignResultStage))
  delete(at__campaign_result_stage)
}
action CampaignResultStagesController__edit {
  at__campaign_result_stage = oneof(CampaignResultStage)
  assert ((inusergroup(admin) and at__campaign_result_stage in CampaignResultStage) or (inusergroup(super_user) and at__campaign_result_stage in CampaignResultStage))
}
action CampaignResultStagesController__index {
  at__campaign_result_stages = subset(CampaignResultStage)
  assert (((inusergroup(admin) and at__campaign_result_stages in CampaignResultStage) or (inusergroup(readonly_user) and at__campaign_result_stages in CampaignResultStage)) or (inusergroup(super_user) and at__campaign_result_stages in CampaignResultStage))
}
action CampaignResultStagesController__new {
  at__campaign_result_stage = create CampaignResultStage
  assert ((inusergroup(admin) and at__campaign_result_stage in CampaignResultStage) or (inusergroup(super_user) and at__campaign_result_stage in CampaignResultStage))
}
action CampaignResultStagesController__update {
  at__campaign_result_stage = oneof(CampaignResultStage)
  assert ((inusergroup(admin) and at__campaign_result_stage in CampaignResultStage) or (inusergroup(super_user) and at__campaign_result_stage in CampaignResultStage))
  at__campaign_result_stage.editor_user = currentuser
}
}
class Contact {
action ContactsController__create {
  at__contact = create Contact
  assert ((((inusergroup(admin) and at__contact in Contact) or (inusergroup(restricted_user) and at__contact in Contact)) or (inusergroup(user) and at__contact in Contact)) or (inusergroup(super_user) and at__contact in Contact))
  at__contact.author_user = currentuser
  if (*) {
    tag = oneof(Tag)
    at__contact.tags += tag
  } else {
    at__contact.tags -= empty
  }
}
action ContactsController__destroy {
  at__contact = oneof(Contact)
  assert ((inusergroup(admin) and at__contact in Contact) or (inusergroup(super_user) and at__contact in Contact))
  foreach email: subset(Email) {
    email.arbitrary_contact = empty
    true
  }
  delete(at__contact.aliases)
  delete(at__contact)
}
action ContactsController__edit {
  at__contact = oneof(Contact)
  assert ((((inusergroup(admin) and at__contact in Contact) or (inusergroup(restricted_user) and at__contact in Contact)) or (inusergroup(user) and at__contact in Contact)) or (inusergroup(super_user) and at__contact in Contact))
}
action ContactsController__index {
  at__contacts = subset(Contact)
  assert (((((inusergroup(admin) and at__contacts in Contact) or (inusergroup(readonly_user) and at__contacts in Contact)) or (inusergroup(restricted_user) and at__contacts in Contact)) or (inusergroup(user) and at__contacts in Contact)) or (inusergroup(super_user) and at__contacts in Contact))
  at__setting = tryoneof(Setting)
}
action ContactsController__new {
  at__contact = create Contact
  assert ((((inusergroup(admin) and at__contact in Contact) or (inusergroup(restricted_user) and at__contact in Contact)) or (inusergroup(user) and at__contact in Contact)) or (inusergroup(super_user) and at__contact in Contact))
}
action ContactsController__show {
  at__contact = oneof(Contact)
  assert (((((inusergroup(admin) and at__contact in Contact) or (inusergroup(readonly_user) and at__contact in Contact)) or (inusergroup(restricted_user) and at__contact in Contact)) or (inusergroup(user) and at__contact in Contact)) or (inusergroup(super_user) and at__contact in Contact))
}
action ContactsController__update {
  at__contact = oneof(Contact)
  assert ((((inusergroup(admin) and at__contact in Contact) or (inusergroup(restricted_user) and at__contact in Contact)) or (inusergroup(user) and at__contact in Contact)) or (inusergroup(super_user) and at__contact in Contact))
  at__contact.editor_user = currentuser
  if (*) {
    tag = oneof(Tag)
    at__contact.tags += tag
  } else {
    at__contact.tags -= empty
  }
}
}
class Contract {
action ContractsController__create {
  at__contract = create Contract
  assert ((((inusergroup(admin) and at__contract in Contract) or (inusergroup(restricted_user) and at__contract in Contract)) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
  at__contract.author_user = currentuser
}
action ContractsController__destroy {
  at__contract = oneof(Contract)
  assert (((inusergroup(admin) and at__contract in Contract) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
  delete(at__contract.contract_attachments)
  delete(at__contract)
}
action ContractsController__edit {
  at__contract = oneof(Contract)
  assert ((((inusergroup(admin) and at__contract in Contract) or (inusergroup(restricted_user) and at__contract in Contract)) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
}
action ContractsController__index {
  at__contracts = subset(Contract)
  assert (((((inusergroup(admin) and at__contracts in Contract) or (inusergroup(readonly_user) and at__contracts in Contract)) or (inusergroup(restricted_user) and at__contracts in Contract)) or (inusergroup(user) and at__contracts in Contract)) or (inusergroup(super_user) and at__contracts in Contract))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__sort = empty
  at__direction = empty
  at__contracts_all = subset(if (not isempty(at__account)) {
    at__account.contracts
  } else {
    Contract
  })
  at__contracts = subset(at__contracts_all)
  at__contracts_scopes = empty
}
action ContractsController__new {
  at__contract = create Contract
  assert ((((inusergroup(admin) and at__contract in Contract) or (inusergroup(restricted_user) and at__contract in Contract)) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
  at__contract.account = oneof(Account)
}
action ContractsController__show {
  at__contract = oneof(Contract)
  assert (((((inusergroup(admin) and at__contract in Contract) or (inusergroup(readonly_user) and at__contract in Contract)) or (inusergroup(restricted_user) and at__contract in Contract)) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
}
action ContractsController__update {
  at__contract = oneof(Contract)
  assert ((((inusergroup(admin) and at__contract in Contract) or (inusergroup(restricted_user) and at__contract in Contract)) or (inusergroup(user) and at__contract in Contract)) or (inusergroup(super_user) and at__contract in Contract))
  at__contract.editor_user = currentuser
}
}
class ContractAttachment {
  0..1 Contract contract
}
class ContractCategory {
action ContractCategoriesController__create {
  at__contract_category = create ContractCategory
  assert ((inusergroup(admin) and at__contract_category in ContractCategory) or (inusergroup(super_user) and at__contract_category in ContractCategory))
  at__contract_category.author_user = currentuser
}
action ContractCategoriesController__destroy {
  at__contract_category = oneof(ContractCategory)
  assert ((inusergroup(admin) and at__contract_category in ContractCategory) or (inusergroup(super_user) and at__contract_category in ContractCategory))
  delete(at__contract_category)
}
action ContractCategoriesController__edit {
  at__contract_category = oneof(ContractCategory)
  assert ((inusergroup(admin) and at__contract_category in ContractCategory) or (inusergroup(super_user) and at__contract_category in ContractCategory))
}
action ContractCategoriesController__index {
  at__contract_categories = subset(ContractCategory)
  assert ((((inusergroup(admin) and at__contract_categories in ContractCategory) or (inusergroup(readonly_user) and at__contract_categories in ContractCategory)) or (inusergroup(user) and at__contract_categories in ContractCategory)) or (inusergroup(super_user) and at__contract_categories in ContractCategory))
  at__contractcategories = subset(ContractCategory)
}
action ContractCategoriesController__new {
  at__contract_category = create ContractCategory
  assert ((inusergroup(admin) and at__contract_category in ContractCategory) or (inusergroup(super_user) and at__contract_category in ContractCategory))
}
action ContractCategoriesController__update {
  at__contract_category = oneof(ContractCategory)
  assert ((inusergroup(admin) and at__contract_category in ContractCategory) or (inusergroup(super_user) and at__contract_category in ContractCategory))
  at__contract_category.editor_user = currentuser
}

}
class Document {
action DocumentsController__create {
  at__document = create Document
  assert ((((inusergroup(admin) and at__document in Document) or (inusergroup(restricted_user) and at__document in Document)) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
  at__document.author_user = currentuser
  if (*) {
    e = create Event
    e.account = at__document.account
    e.author_user = currentuser
    e.user = currentuser
    empty
  }
}
action DocumentsController__destroy {
  at__document = oneof(Document)
  assert (((inusergroup(admin) and at__document in Document) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
  delete(at__document.document_attachments)
  delete(at__document)
}
action DocumentsController__edit {
  at__document = oneof(Document)
  assert ((((inusergroup(admin) and at__document in Document) or (inusergroup(restricted_user) and at__document in Document)) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
}
action DocumentsController__index {
  at__documents = subset(Document)
  assert (((((inusergroup(admin) and at__documents in Document) or (inusergroup(readonly_user) and at__documents in Document)) or (inusergroup(restricted_user) and at__documents in Document)) or (inusergroup(user) and at__documents in Document)) or (inusergroup(super_user) and at__documents in Document))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__documents = subset(if (not isempty(at__account)) {
    at__account.documents
  } else {
    Document
  })
}
action DocumentsController__new {
  at__document = create Document
  assert ((((inusergroup(admin) and at__document in Document) or (inusergroup(restricted_user) and at__document in Document)) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
  at__document.account = oneof(Account)
}
action DocumentsController__show {
  at__document = oneof(Document)
  assert (((((inusergroup(admin) and at__document in Document) or (inusergroup(readonly_user) and at__document in Document)) or (inusergroup(restricted_user) and at__document in Document)) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
}
action DocumentsController__update {
  at__document = oneof(Document)
  assert ((((inusergroup(admin) and at__document in Document) or (inusergroup(restricted_user) and at__document in Document)) or (inusergroup(user) and at__document in Document)) or (inusergroup(super_user) and at__document in Document))
  at__document.editor_user = currentuser
}
}
class DocumentAttachment {
}
class Email {
action EmailsController__convert {
  at__email = empty
  if (*) {
    at__email = oneof(Email)
    delete(at__email.email_attachments)
    delete(at__email)
    empty
  }
}
action EmailsController__destroy {
  at__email = oneof(Email)
  delete(at__email.email_attachments)
  delete(at__email)
}
action EmailsController__edit {
  at__email = oneof(Email)
}
action EmailsController__index {
  at__emails = subset(Email)
  at__accounts = Account
}
action EmailsController__update {
  at__email = oneof(Email)
}

}
class EmailAttachment {

}
class Event {
action EventsController__create {
  at__task = empty
  at__event = create Event
  assert ((((inusergroup(admin) and at__event in Event) or (inusergroup(restricted_user) and at__event in Event)) or (inusergroup(user) and at__event in Event)) or (inusergroup(super_user) and at__event in Event))
  at__event.author_user = currentuser
  if (*) {
    if (*) {
      if (*) {
        at__task = create Task
        at__task.account = oneof(Account)
        at__task.contact = oneof(Contact)
        at__task.user = oneof(User)
        at__task.author_user = currentuser
        if (*) {
          at__event.task = at__task
          true
        } else {
          false
        }
      }
      empty
    }
  }
}
action EventsController__destroy {
  at__event = oneof(Event)
  assert ((((inusergroup(admin) and at__event in Event) or (inusergroup(restricted_user) and at__event in currentuser.events)) or (inusergroup(user) and at__event in currentuser.events)) or (inusergroup(super_user) and at__event in Event))
  delete(at__event.event_attachments)
  delete(at__event)
}
action EventsController__edit {
  at__event = oneof(Event)
  assert ((((inusergroup(admin) and at__event in Event) or (inusergroup(restricted_user) and at__event in currentuser.events)) or (inusergroup(user) and at__event in currentuser.events)) or (inusergroup(super_user) and at__event in Event))
}
action EventsController__index {
  at__event_new = empty
  at__events = subset(Event)
  assert (((((inusergroup(admin) and at__events in Event) or (inusergroup(readonly_user) and at__events in Event)) or (inusergroup(restricted_user) and at__events in Event)) or (inusergroup(user) and at__events in Event)) or (inusergroup(super_user) and at__events in Event))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  if (not isempty(at__account)) {
    at__event_new = create((at__account).events)
  }
  if (not isempty(at__event_new)) {
    at__event_new.event_type = oneof(EventType)
  }
  at__events = subset(if (not isempty(at__account)) {
    at__account.events
  } else {
    Event
  })
}
action EventsController__new {
  at__event = create Event
  assert ((((inusergroup(admin) and at__event in Event) or (inusergroup(restricted_user) and at__event in Event)) or (inusergroup(user) and at__event in Event)) or (inusergroup(super_user) and at__event in Event))
  at__event.account = oneof(Account)
  at__event.event_type = oneof(EventType)
}
action EventsController__show {
  at__event = oneof(Event)
  assert (((((inusergroup(admin) and at__event in Event) or (inusergroup(readonly_user) and at__event in Event)) or (inusergroup(restricted_user) and at__event in Event)) or (inusergroup(user) and at__event in Event)) or (inusergroup(super_user) and at__event in Event))
}
action EventsController__update {
  at__event = oneof(Event)
  assert ((((inusergroup(admin) and at__event in Event) or (inusergroup(restricted_user) and at__event in currentuser.events)) or (inusergroup(user) and at__event in currentuser.events)) or (inusergroup(super_user) and at__event in Event))
  at__event.editor_user = currentuser
}
}
class EventAttachment {
 action AttachmentsController__destroy {}
 action CampaignCompletedStagesController__create {
   at__campaign_completed_stage = create CampaignCompletedStage
   assert ((inusergroup(admin) and at__campaign_completed_stage in CampaignCompletedStage) or (inusergroup(super_user) and at__campaign_completed_stage in CampaignCompletedStage))
   at__campaign_completed_stage.author_user = currentuser
 }
}
class EventType {
action EventTypesController__create {
  at__event_type = create EventType
  assert ((inusergroup(admin) and at__event_type in EventType) or (inusergroup(super_user) and at__event_type in EventType))
  at__eventtype = create EventType
  at__eventtype.author_user = currentuser
}
action EventTypesController__destroy {
  at__event_type = oneof(EventType)
  assert ((inusergroup(admin) and at__event_type in EventType) or (inusergroup(super_user) and at__event_type in EventType))
  at__eventtype = oneof(EventType)
  delete(at__eventtype)
}
action EventTypesController__edit {
  at__event_type = oneof(EventType)
  assert ((inusergroup(admin) and at__event_type in EventType) or (inusergroup(super_user) and at__event_type in EventType))
  at__eventtype = oneof(EventType)
}
action EventTypesController__index {
  at__event_types = subset(EventType)
  assert ((((inusergroup(admin) and at__event_types in EventType) or (inusergroup(readonly_user) and at__event_types in EventType)) or (inusergroup(user) and at__event_types in EventType)) or (inusergroup(super_user) and at__event_types in EventType))
  at__eventtypes = subset(EventType)
}
action EventTypesController__new {
  at__event_type = create EventType
  assert ((inusergroup(admin) and at__event_type in EventType) or (inusergroup(super_user) and at__event_type in EventType))
  at__eventtype = create EventType
}
action EventTypesController__update {
  at__event_type = oneof(EventType)
  assert ((inusergroup(admin) and at__event_type in EventType) or (inusergroup(super_user) and at__event_type in EventType))
  at__eventtype = oneof(EventType)
  at__eventtype.editor_user = currentuser
}
}
class Import {
action ImportsController__accounts {
  raise
}
action ImportsController__contacts {
  raise
}
action ImportsController__create {
  at__origin = empty
  at__type = empty
  if (*) {
    at__origin = empty
  }
  at__import = create Import
  at__import.author_user = currentuser
}
action ImportsController__destroy {
  at__import = oneof(Import)
  delete(at__import.accounts.contacts.aliases)
  delete(at__import.accounts.contacts)
  delete(at__import.accounts.opportunities.opportunity_attachments)
  delete(at__import.accounts.opportunities)
  delete(at__import.accounts.quotations.quotation_lines)
  delete(at__import.accounts.quotations.quotation_attachments)
  delete(at__import.accounts.quotations)
  delete(at__import.accounts.events.event_attachments)
  delete(at__import.accounts.events)
  delete(at__import.accounts.tasks.task_attachments)
  delete(at__import.accounts.tasks)
  delete(at__import.accounts.documents.document_attachments)
  delete(at__import.accounts.documents)
  delete(at__import.accounts.contracts.contract_attachments)
  delete(at__import.accounts.contracts)
  delete(at__import.accounts)
  delete(at__import.import_accounts)
  delete(at__import.contacts.aliases)
  delete(at__import.contacts)
  delete(at__import.import_contacts)
  delete(at__import)
}
action ImportsController__index {
  at__imports = Import
}
action ImportsController__new {
  at__import = create Import
  at__import.user = currentuser
  at__users = subset(User)
}
}
class ImportAccount {
action ImportAccountsController__destroy {
  at__import_account = oneof(ImportAccount)
  delete(at__import_account)
  foreach i: subset(ImportAccount) {
    i.anomaly = empty
    if (*) {
      if (*) {
        foreach account2: subset(ImportAccount) {
          if (*) {
            account2.anomaly = empty
          }
        }
        if (*) {
          foreach account2: subset(Account) {
            i.account = account2
          }
        }
      }
    }
    i.anomaly = empty
  }
}
action ImportAccountsController__edit {
  at__import_account = oneof(ImportAccount)
  at__users = subset(User)
  at__title = empty
  at__link = empty
  at__select = empty
}
action ImportAccountsController__index {
  at__select = empty
  at__title = empty
  at__link = empty
  at__all_import_accounts = empty
  at__anomalies_filter = subset(Anomaly)
  at__import_accounts = subset(ImportAccount)
  if (*) {
    at__select = empty
  }
}
action ImportAccountsController__update {
  at__import_account = oneof(ImportAccount)
  at__import_account.editor_user = currentuser
  if (*) {
    if (*) {
      foreach account2: subset(ImportAccount) {
        if (*) {
          account2.anomaly = empty
        }
      }
      if (*) {
        foreach account2: subset(Account) {
          at__import_account.account = account2
        }
      }
    }
  }
  at__import_account.anomaly = empty
  foreach i: subset(ImportAccount) {
    i.anomaly = empty
    if (*) {
      if (*) {
        foreach account2: subset(ImportAccount) {
          if (*) {
            account2.anomaly = empty
          }
        }
        if (*) {
          foreach account2: subset(Account) {
            i.account = account2
          }
        }
      }
    }
    i.anomaly = empty
  }
}
}
class ImportContact {
action ImportContactsController__destroy {
  at__import_contact = oneof(ImportContact)
  delete(at__import_contact)
  foreach i: subset(ImportContact) {
    i.anomaly = empty
    empty
  }
}
action ImportContactsController__edit {
  at__contact = oneof(ImportContact)
  at__users = subset(User)
  at__title = empty
  at__link = empty
  at__select = empty
}
action ImportContactsController__index {
  at__select = empty
  at__title = empty
  at__link = empty
  at__all_import_contacts = empty
  at__anomalies_filter = subset(Anomaly)
  at__import_contacts = subset(ImportContact)
  if (*) {
    at__select = empty
  }
}
}
class Opportunity {
action NotificationsController__index {
  at__connection = empty
  at__emails = subset(Email)
  at__tasks = subset(Task)
  if (*) {
    at__connection = tryoneof(WebmailConnection)
  } else {
    at__connection = create WebmailConnection
  }
}
action OpportunitiesController__create {
  at__opportunity = create Opportunity
  assert ((((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(restricted_user) and at__opportunity in Opportunity)) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
  at__opportunity.author_user = currentuser
}
action OpportunitiesController__destroy {
  at__opportunity = oneof(Opportunity)
  assert (((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
  delete(at__opportunity.opportunity_attachments)
  delete(at__opportunity)
}
action OpportunitiesController__edit {
  at__opportunity = oneof(Opportunity)
  assert ((((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(restricted_user) and at__opportunity in Opportunity)) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
  at__users = subset(User)
}
action OpportunitiesController__index {
  at__opportunities = subset(Opportunity)
  assert (((((inusergroup(admin) and at__opportunities in Opportunity) or (inusergroup(readonly_user) and at__opportunities in Opportunity)) or (inusergroup(restricted_user) and at__opportunities in Opportunity)) or (inusergroup(user) and at__opportunities in Opportunity)) or (inusergroup(super_user) and at__opportunities in Opportunity))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__sort = empty
  at__direction = empty
  at__opportunities_all = subset(if (not isempty(at__account)) {
    at__account.opportunities
  } else {
    Opportunity
  })
  at__opportunities = subset(at__opportunities_all)
  at__opportunities_scopes = empty
  at__total_amount = empty
  at__total_profit = empty
}
action OpportunitiesController__new {
  at__opportunity = create Opportunity
  assert ((((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(restricted_user) and at__opportunity in Opportunity)) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
  at__opportunity.user = currentuser
  at__opportunity.account = oneof(Account)
}
action OpportunitiesController__show {
  at__opportunity = oneof(Opportunity)
  assert (((((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(readonly_user) and at__opportunity in Opportunity)) or (inusergroup(restricted_user) and at__opportunity in Opportunity)) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
}
action OpportunitiesController__update {
  at__opportunity = oneof(Opportunity)
  assert ((((inusergroup(admin) and at__opportunity in Opportunity) or (inusergroup(restricted_user) and at__opportunity in Opportunity)) or (inusergroup(user) and at__opportunity in Opportunity)) or (inusergroup(super_user) and at__opportunity in Opportunity))
  at__opportunity_before_update = oneof(Opportunity)
  at__opportunity.editor_user = currentuser
}
}
class OpportunityAttachment {

}
class Origin {
 action OriginsController__create {
   at__origin = create Origin
   assert ((inusergroup(admin) and at__origin in Origin) or (inusergroup(super_user) and at__origin in Origin))
   at__origin.author_user = currentuser
 }
 action OriginsController__destroy {
   at__origin = oneof(Origin)
   assert ((inusergroup(admin) and at__origin in Origin) or (inusergroup(super_user) and at__origin in Origin))
   delete(at__origin)
 }
 action OriginsController__edit {
   at__origin = oneof(Origin)
   assert ((inusergroup(admin) and at__origin in Origin) or (inusergroup(super_user) and at__origin in Origin))
 }
 action OriginsController__index {
   at__origins = subset(Origin)
   assert ((((inusergroup(admin) and at__origins in Origin) or (inusergroup(readonly_user) and at__origins in Origin)) or (inusergroup(user) and at__origins in Origin)) or (inusergroup(super_user) and at__origins in Origin))
 }
 action OriginsController__new {
   at__origin = create Origin
   assert ((inusergroup(admin) and at__origin in Origin) or (inusergroup(super_user) and at__origin in Origin))
 }
 action OriginsController__update {
   at__origin = oneof(Origin)
   assert ((inusergroup(admin) and at__origin in Origin) or (inusergroup(super_user) and at__origin in Origin))
   at__origin.editor_user = currentuser
 }
}
class PaymentMode {
action PaymentModesController__create {
  at__payment_mode = create PaymentMode
  assert ((inusergroup(admin) and at__payment_mode in PaymentMode) or (inusergroup(super_user) and at__payment_mode in PaymentMode))
  at__payment_mode.author_user = currentuser
}
action PaymentModesController__destroy {
  at__payment_mode = oneof(PaymentMode)
  assert ((inusergroup(admin) and at__payment_mode in PaymentMode) or (inusergroup(super_user) and at__payment_mode in PaymentMode))
}
action PaymentModesController__edit {
  at__payment_mode = oneof(PaymentMode)
  assert ((inusergroup(admin) and at__payment_mode in PaymentMode) or (inusergroup(super_user) and at__payment_mode in PaymentMode))
}
action PaymentModesController__index {
  at__payment_modes = subset(PaymentMode)
  assert (((((inusergroup(admin) and at__payment_modes in PaymentMode) or (inusergroup(readonly_user) and at__payment_modes in PaymentMode)) or (inusergroup(restricted_user) and at__payment_modes in PaymentMode)) or (inusergroup(user) and at__payment_modes in PaymentMode)) or (inusergroup(super_user) and at__payment_modes in PaymentMode))
}
action PaymentModesController__new {
  at__payment_mode = create PaymentMode
  assert ((inusergroup(admin) and at__payment_mode in PaymentMode) or (inusergroup(super_user) and at__payment_mode in PaymentMode))
}
action PaymentModesController__update {
  at__payment_mode = oneof(PaymentMode)
  assert ((inusergroup(admin) and at__payment_mode in PaymentMode) or (inusergroup(super_user) and at__payment_mode in PaymentMode))
  at__payment_mode.editor_user = currentuser
}

}
class PaymentTerm {
action PaymentTermsController__create {
  at__payment_term = create PaymentTerm
  assert ((inusergroup(admin) and at__payment_term in PaymentTerm) or (inusergroup(super_user) and at__payment_term in PaymentTerm))
  at__payment_term.author_user = currentuser
}
action PaymentTermsController__destroy {
  at__payment_term = oneof(PaymentTerm)
  assert ((inusergroup(admin) and at__payment_term in PaymentTerm) or (inusergroup(super_user) and at__payment_term in PaymentTerm))
}
action PaymentTermsController__edit {
  at__payment_term = oneof(PaymentTerm)
  assert ((inusergroup(admin) and at__payment_term in PaymentTerm) or (inusergroup(super_user) and at__payment_term in PaymentTerm))
}
action PaymentTermsController__index {
  at__payment_terms = subset(PaymentTerm)
  assert (((((inusergroup(admin) and at__payment_terms in PaymentTerm) or (inusergroup(readonly_user) and at__payment_terms in PaymentTerm)) or (inusergroup(restricted_user) and at__payment_terms in PaymentTerm)) or (inusergroup(user) and at__payment_terms in PaymentTerm)) or (inusergroup(super_user) and at__payment_terms in PaymentTerm))
}
action PaymentTermsController__new {
  at__payment_term = create PaymentTerm
  assert ((inusergroup(admin) and at__payment_term in PaymentTerm) or (inusergroup(super_user) and at__payment_term in PaymentTerm))
}
action PaymentTermsController__update {
  at__payment_term = oneof(PaymentTerm)
  assert ((inusergroup(admin) and at__payment_term in PaymentTerm) or (inusergroup(super_user) and at__payment_term in PaymentTerm))
  at__payment_term.editor_user = currentuser
}
}
class Quotation {
action QuotationsController__create {
  at__event = empty
  at__quotation = create Quotation
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
  at__quotation.author_user = currentuser
  if (*) {
    if (not (((inusergroup(admin) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
      false
    } else {
      at__event = create Event
      at__event.account = oneof(Account)
      at__event.contact = oneof(Contact)
      at__event.quotation = at__quotation
      if (*) {
        at__event.editor_user = currentuser
      } else {
        at__event.author_user = currentuser
      }
    }
    empty
  }
}
action QuotationsController__destroy {
  at__quotation = oneof(Quotation)
  assert (((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
  delete(at__quotation.quotation_lines)
  delete(at__quotation.quotation_attachments)
  delete(at__quotation)
}
action QuotationsController__edit {
  at__quotation = oneof(Quotation)
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
  at__users = subset(User)
}
action QuotationsController__get_companies {
  at__quotation = oneof(Quotation)
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
}
action QuotationsController__get_contacts {
  at__quotation = oneof(Quotation)
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
}
action QuotationsController__index {
  at__quotations = subset(Quotation)
  assert (((((inusergroup(admin) and at__quotations in Quotation) or (inusergroup(readonly_user) and at__quotations in Quotation)) or (inusergroup(restricted_user) and at__quotations in Quotation)) or (inusergroup(user) and at__quotations in Quotation)) or (inusergroup(super_user) and at__quotations in Quotation))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__sort = empty
  at__direction = empty
  at__quotations_all = subset(if (not isempty(at__account)) {
    at__account.quotations
  } else {
    Quotation
  })
  at__quotations = subset(at__quotations_all)
  at__quotations_scopes = empty
  at__total_amount = empty
  at__total_number = empty
  at__total_amount = empty
}
action QuotationsController__new {
  at__quotation = create Quotation
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
  at__quotation.user = currentuser
  at__quotation.account = oneof(Account)
}
action QuotationsController__show {
  at__quotation = oneof(Quotation)
  assert (((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(readonly_user) and at__quotation in Quotation)) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
}
action QuotationsController__update {
  at__event = empty
  at__quotation = oneof(Quotation)
  assert ((((inusergroup(admin) and at__quotation in Quotation) or (inusergroup(restricted_user) and at__quotation in Quotation)) or (inusergroup(user) and at__quotation in Quotation)) or (inusergroup(super_user) and at__quotation in Quotation))
  at__quotation_before_update = oneof(Quotation)
  at__quotation.editor_user = currentuser
  if (*) {
    if (*) {
      if (not (((inusergroup(admin) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
        false
      } else {
        at__event = create Event
        at__event.account = oneof(Account)
        at__event.contact = oneof(Contact)
        at__event.quotation = at__quotation
        if (*) {
          at__event.editor_user = currentuser
        } else {
          at__event.author_user = currentuser
        }
      }
    }
    empty
  }
}
}
class QuotationAttachment {

}
class QuotationLine {

}
class QuotationTemplate {
action QuotationTemplatesController__create {
  at__quotation_template = create QuotationTemplate
  assert ((inusergroup(admin) and at__quotation_template in QuotationTemplate) or (inusergroup(super_user) and at__quotation_template in QuotationTemplate))
  at__template = create QuotationTemplate
  at__template.author_user = currentuser
}
action QuotationTemplatesController__destroy {
  at__quotation_template = oneof(QuotationTemplate)
  assert ((inusergroup(admin) and at__quotation_template in QuotationTemplate) or (inusergroup(super_user) and at__quotation_template in QuotationTemplate))
  at__template = oneof(QuotationTemplate)
  delete(at__template)
}
action QuotationTemplatesController__edit {
  at__quotation_template = oneof(QuotationTemplate)
  assert ((inusergroup(admin) and at__quotation_template in QuotationTemplate) or (inusergroup(super_user) and at__quotation_template in QuotationTemplate))
  at__template = oneof(QuotationTemplate)
}
action QuotationTemplatesController__index {
  at__quotation_templates = subset(QuotationTemplate)
  assert ((((inusergroup(admin) and at__quotation_templates in QuotationTemplate) or (inusergroup(readonly_user) and at__quotation_templates in QuotationTemplate)) or (inusergroup(user) and at__quotation_templates in QuotationTemplate)) or (inusergroup(super_user) and at__quotation_templates in QuotationTemplate))
  at__page = empty
  at__templates = subset(QuotationTemplate)
}
action QuotationTemplatesController__new {
  at__quotation_template = create QuotationTemplate
  assert ((inusergroup(admin) and at__quotation_template in QuotationTemplate) or (inusergroup(super_user) and at__quotation_template in QuotationTemplate))
  at__template = create QuotationTemplate
}
action QuotationTemplatesController__update {
  at__quotation_template = oneof(QuotationTemplate)
  assert ((inusergroup(admin) and at__quotation_template in QuotationTemplate) or (inusergroup(super_user) and at__quotation_template in QuotationTemplate))
  at__template = oneof(QuotationTemplate)
  at__template.editor_user = currentuser
}

}
class Relation {
action RelationsController__new {
  at__relation = create Relation
  assert ((((inusergroup(admin) and at__relation in Relation) or (inusergroup(restricted_user) and at__relation in Relation)) or (inusergroup(user) and at__relation in Relation)) or (inusergroup(super_user) and at__relation in Relation))
  at__relation.account1 = oneof(Account)
}
action RelationsController__update {
  at__relation = oneof(Relation)
  assert ((((inusergroup(admin) and at__relation in Relation) or (inusergroup(restricted_user) and at__relation in Relation)) or (inusergroup(user) and at__relation in Relation)) or (inusergroup(super_user) and at__relation in Relation))
  at__relation.editor_user = currentuser
}
action RelationsController__create {
  at__relation = create Relation
  assert ((((inusergroup(admin) and at__relation in Relation) or (inusergroup(restricted_user) and at__relation in Relation)) or (inusergroup(user) and at__relation in Relation)) or (inusergroup(super_user) and at__relation in Relation))
  at__relation.author_user = currentuser
}
action RelationsController__destroy {
  at__relation = oneof(Relation)
  assert ((((inusergroup(admin) and at__relation in Relation) or (inusergroup(restricted_user) and at__relation in Relation)) or (inusergroup(user) and at__relation in Relation)) or (inusergroup(super_user) and at__relation in Relation))
  delete(at__relation)
}
action RelationsController__edit {
  at__relation = oneof(Relation)
  assert ((((inusergroup(admin) and at__relation in Relation) or (inusergroup(restricted_user) and at__relation in Relation)) or (inusergroup(user) and at__relation in Relation)) or (inusergroup(super_user) and at__relation in Relation))
}
action RelationsController__index {
  at__relations = subset(Relation)
  assert (((((inusergroup(admin) and at__relations in Relation) or (inusergroup(readonly_user) and at__relations in Relation)) or (inusergroup(restricted_user) and at__relations in Relation)) or (inusergroup(user) and at__relations in Relation)) or (inusergroup(super_user) and at__relations in Relation))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__relations = subset(if (not isempty(at__account)) {
    subset(Relation)
  } else {
    Relation
  })
}
}
class Role {

}
class Setting {
}
action SettingsController__index {
  at__webmail_connection = empty
  at__setting = empty
  if (inusergroup(admin)) {
    if (*) {
      at__setting = tryoneof(Setting)
    } else {
      at__setting = create Setting
    }
    if (*) {
      at__webmail_connection = tryoneof(WebmailConnection)
    } else {
      at__webmail_connection = create WebmailConnection
    }
  } else {
    false
  }
}
action SettingsController__update {
  at__setting = oneof(Setting)
}
}
class Tag {
action TagsController__new {
  at__tag = create Tag
  assert ((inusergroup(admin) and at__tag in Tag) or (inusergroup(super_user) and at__tag in Tag))
}
action TagsController__show {
  at__tag = oneof(Tag)
  assert (((((inusergroup(admin) and at__tag in Tag) or (inusergroup(readonly_user) and at__tag in Tag)) or (inusergroup(restricted_user) and at__tag in Tag)) or (inusergroup(user) and at__tag in Tag)) or (inusergroup(super_user) and at__tag in Tag))
}
action TagsController__update {
  at__tag = oneof(Tag)
  assert ((inusergroup(admin) and at__tag in Tag) or (inusergroup(super_user) and at__tag in Tag))
  at__tag.editor_user = currentuser
}
action TagsController__destroy {
  at__tag = oneof(Tag)
  assert ((inusergroup(admin) and at__tag in Tag) or (inusergroup(super_user) and at__tag in Tag))
  delete(at__tag)
}
action TagsController__edit {
  at__tag = oneof(Tag)
  assert ((inusergroup(admin) and at__tag in Tag) or (inusergroup(super_user) and at__tag in Tag))
}
action TagsController__index {
  at__account = empty
  at__tags = subset(Tag)
  assert (((((inusergroup(admin) and at__tags in Tag) or (inusergroup(readonly_user) and at__tags in Tag)) or (inusergroup(restricted_user) and at__tags in Tag)) or (inusergroup(user) and at__tags in Tag)) or (inusergroup(super_user) and at__tags in Tag))
  if (*) {
    at__account = oneof(Account)
  }
  at__setting = tryoneof(Setting)
  at__tags = subset(if (not isempty(at__account)) {
    at__account.tags
  } else {
    Tag
  })
}
action TagsController__create {
  at__tag = create Tag
  assert ((inusergroup(admin) and at__tag in Tag) or (inusergroup(super_user) and at__tag in Tag))
  at__tag.author_user = currentuser
}
}
class Task {
action TasksController__create {
  at__users = empty
  at__event = empty
  at__task = create Task
  assert ((((inusergroup(admin) and at__task in Task) or (inusergroup(restricted_user) and at__task in Task)) or (inusergroup(user) and at__task in Task)) or (inusergroup(super_user) and at__task in Task))
  at__task.author_user = currentuser
  if (*) {
    if ((((inusergroup(admin) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
      at__event = create Event
      at__event.event_type = at__task.event_type
      at__event.account = at__task.account
      at__event.contact = at__task.contact
      if (*) {
        at__event.editor_user = currentuser
      } else {
        at__event.author_user = currentuser
      }
      at__event.task = at__task
    }
    empty
  } else {
    at__users = subset(User)
    empty
  }
}
action TasksController__destroy {
  at__task = oneof(Task)
  assert (inusergroup(admin) and at__task in Task)
  delete(at__task.task_attachments)
  delete(at__task)
}
action TasksController__edit {
  at__task = oneof(Task)
  assert ((((inusergroup(admin) and at__task in Task) or (inusergroup(restricted_user) and at__task in Task)) or (inusergroup(user) and at__task in Task)) or (inusergroup(super_user) and at__task in Task))
  at__users = subset(User)
}
action TasksController__index {
  at__tasks = subset(Task)
  assert (((((inusergroup(admin) and at__tasks in Task) or (inusergroup(readonly_user) and at__tasks in Task)) or (inusergroup(restricted_user) and at__tasks in Task)) or (inusergroup(user) and at__tasks in Task)) or (inusergroup(super_user) and at__tasks in Task))
  at__account = oneof(Account)
  at__setting = tryoneof(Setting)
  at__sort = empty
  at__direction = empty
  at__tasks = subset(if (not isempty(at__account)) {
    at__account.tasks
  } else {
    Task
  })
  if (*) {
    at__tasks = subset(at__tasks)
  }
  at__tasks = subset(at__tasks)
}
action TasksController__new {
  at__task = create Task
  assert ((((inusergroup(admin) and at__task in Task) or (inusergroup(restricted_user) and at__task in Task)) or (inusergroup(user) and at__task in Task)) or (inusergroup(super_user) and at__task in Task))
  at__task.user = currentuser
  at__task.account = oneof(Account)
  at__users = subset(User)
}
action TasksController__show {
  at__task = oneof(Task)
  assert (((((inusergroup(admin) and at__task in Task) or (inusergroup(readonly_user) and at__task in Task)) or (inusergroup(restricted_user) and at__task in Task)) or (inusergroup(user) and at__task in Task)) or (inusergroup(super_user) and at__task in Task))
}
action TasksController__update {
  at__event = empty
  at__task = oneof(Task)
  assert ((((inusergroup(admin) and at__task in Task) or (inusergroup(restricted_user) and at__task in Task)) or (inusergroup(user) and at__task in Task)) or (inusergroup(super_user) and at__task in Task))
  at__task_before_update = oneof(Task)
  at__task.editor_user = currentuser
  if (*) {
    if (*) {
      if ((((inusergroup(admin) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
        at__event = create Event
        at__event.event_type = at__task.event_type
        at__event.account = at__task.account
        at__event.contact = at__task.contact
        if (*) {
          at__event.editor_user = currentuser
        } else {
          at__event.author_user = currentuser
        }
        at__event.task = at__task
      }
    }
    empty
  }
}
}
class TaskAttachment {

}
 class User {
action RegistrationsController__create {
  at__user = empty
  if (*) {
    if (inusergroup(admin)) {
      at__user = create User
      empty
    } else {
      false
    }
  } else {
    at__user = create User
    empty
  }
}
action RegistrationsController__destroy {}
action RegistrationsController__edit {
  at__user_role_name = empty
  at__user = empty
  if (*) {
    false
  } else {
    if (not (inusergroup(admin) or inusergroup(super_user))) {
      if (*) {
        at__user = currentuser
      } else {
        false
      }
    } else {
      if (inusergroup(super_user)) {
        at__user = oneof(User)
        at__user_role_name = empty
      }
    }
  }
}
action RegistrationsController__index {
  at__all_reals_user_count = empty
  at__users = empty
  if (*) {
    false
  } else {
    if (((((inusergroup(admin) or inusergroup(readonly_user)) or inusergroup(restricted_user)) or inusergroup(user)) or inusergroup(super_user))) {
      if (inusergroup(admin)) {
        at__users = User
      } else {
        at__users = subset(User)
      }
      at__all_reals_user_count = empty
    } else {
      false
    }
  }
}
action RegistrationsController__new {
  at__user = empty
  if (*) {
    false
  } else {
    at__user = create User
    empty
  }
}
action RegistrationsController__update {
  at__user = empty
  if (*) {
    false
  } else {
    if (inusergroup(super_user)) {
      at__user = oneof(User)
    } else {
      if (*) {
        at__user = oneof(User)
      }
    }
    empty
  }

}
class WebmailConnection {
}

