class FitbitAccount {

}
class FoursquareAccount {

}
class JournalEntry {
action JournalEntriesController__create {
  at__journal_entry = create JournalEntry
  assert at__journal_entry in currentuser.journal_entries
}
action JournalEntriesController__destroy {
  at__journal_entry = oneof(JournalEntry)
  assert at__journal_entry in currentuser.journal_entries
  delete(at__journal_entry)
}
action JournalEntriesController__edit {
  at__journal_entry = oneof(JournalEntry)
  assert at__journal_entry in currentuser.journal_entries
}
action JournalEntriesController__index {
  at__journal_entries = subset(JournalEntry)
  assert at__journal_entries in currentuser.journal_entries
  at__journal_entries = currentuser.journal_entries
}
action JournalEntriesController__new {
  at__journal_entry = create JournalEntry
  assert at__journal_entry in currentuser.journal_entries
}
action JournalEntriesController__show {
  at__journal_entry = oneof(JournalEntry)
  assert at__journal_entry in currentuser.journal_entries
}
action JournalEntriesController__update {
  at__journal_entry = oneof(JournalEntry)
  assert at__journal_entry in currentuser.journal_entries
}
}
class Meal {
action MealsController__create {
  at__meal = create Meal
  assert at__meal in currentuser.meals
}
action MealsController__destroy {
  at__meal = oneof(Meal)
  assert at__meal in currentuser.meals
  delete(at__meal)
}
action MealsController__edit {
  at__meal = oneof(Meal)
  assert at__meal in currentuser.meals
}
action MealsController__index {
  at__meals = subset(Meal)
  assert at__meals in currentuser.meals
  at__meals = currentuser.meals
}
action MealsController__new {
  at__meal = create Meal
  assert at__meal in currentuser.meals
}
action MealsController__show {
  at__meal = oneof(Meal)
  assert at__meal in currentuser.meals
}
action MealsController__update {
  at__meal = oneof(Meal)
  assert at__meal in currentuser.meals
}
}
class Place {
action PlacesController__create {
  at__place = create Place
  assert at__place in currentuser.places
}
action PlacesController__destroy {
  at__place = oneof(Place)
  assert at__place in currentuser.places
  delete(at__place)
}
action PlacesController__edit {
  at__place = oneof(Place)
  assert at__place in currentuser.places
}
action PlacesController__index {
  at__places = subset(Place)
  assert at__places in currentuser.places
  at__places = currentuser.places
}
action PlacesController__new {
  at__place = create Place
  assert at__place in currentuser.places
}
action PlacesController__show {
  at__place = oneof(Place)
  assert at__place in currentuser.places
}
action PlacesController__update {
  at__place = oneof(Place)
  assert at__place in currentuser.places
}
}
class Sleep {
action SleepsController__create {
  at__sleep = create Sleep
  assert at__sleep in currentuser.sleeps
}
action SleepsController__destroy {
  at__sleep = oneof(Sleep)
  assert at__sleep in currentuser.sleeps
  delete(at__sleep)
}
action SleepsController__edit {
  at__sleep = oneof(Sleep)
  assert at__sleep in currentuser.sleeps
}
action SleepsController__index {
  at__sleeps = subset(Sleep)
  assert at__sleeps in currentuser.sleeps
  at__sleeps = currentuser.sleeps
}
action SleepsController__new {
  at__sleep = create Sleep
  assert at__sleep in currentuser.sleeps
}
action SleepsController__show {
  at__sleep = oneof(Sleep)
  assert at__sleep in currentuser.sleeps
}
action SleepsController__update {
  at__sleep = oneof(Sleep)
  assert at__sleep in currentuser.sleeps
}
}

class User {
action UsersController__show {
  at__user = oneof(User)
  assert at__user in currentuser
}

}
class Weight {
action WeightsController__create {
  at__weight = create Weight
  assert at__weight in currentuser.weights
}
action WeightsController__destroy {
  at__weight = oneof(Weight)
  assert at__weight in currentuser.weights
  delete(at__weight)
}
action WeightsController__edit {
  at__weight = oneof(Weight)
  assert at__weight in currentuser.weights
}
action WeightsController__index {
  at__weights = subset(Weight)
  assert at__weights in currentuser.weights
  at__weights = currentuser.weights
}
action WeightsController__new {
  at__weight = create Weight
  assert at__weight in currentuser.weights
}
action WeightsController__show {
  at__weight = oneof(Weight)
  assert at__weight in currentuser.weights
}
action WeightsController__update {
  at__weight = oneof(Weight)
  assert at__weight in currentuser.weights
}

}
class WithingsAccount {

}