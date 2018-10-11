class DamageGrid {
 action DamageGridsController__create {
   at__damage_grid = create DamageGrid
   assert (inusergroup(admin) and at__damage_grid in DamageGrid)
   at__grid = create DamageGrid
 }
 action DamageGridsController__destroy {
   at__damage_grid = oneof(DamageGrid)
   assert (inusergroup(admin) and at__damage_grid in DamageGrid)
   at__grid = oneof(DamageGrid)
   delete(at__grid)
 }
 action DamageGridsController__edit {
   at__damage_grid = oneof(DamageGrid)
   assert (inusergroup(admin) and at__damage_grid in DamageGrid)
   at__grid = oneof(DamageGrid)
 }
 action DamageGridsController__index {
   at__damage_grids = subset(DamageGrid)
   assert (((inusergroup(admin) and at__damage_grids in DamageGrid) or (inusergroup(guest) and at__damage_grids in DamageGrid)) or at__damage_grids in DamageGrid)
   at__grids = DamageGrid
 }
 action DamageGridsController__new {
   at__damage_grid = create DamageGrid
   assert (inusergroup(admin) and at__damage_grid in DamageGrid)
   at__grid = create DamageGrid
 }
 action DamageGridsController__show {
   at__damage_grid = oneof(DamageGrid)
   assert (((inusergroup(admin) and at__damage_grid in DamageGrid) or (inusergroup(guest) and at__damage_grid in DamageGrid)) or at__damage_grid in DamageGrid)
   at__grid = oneof(DamageGrid)
 }
 action DamageGridsController__update {
   at__damage_grid = oneof(DamageGrid)
   assert (inusergroup(admin) and at__damage_grid in DamageGrid)
   at__grid = oneof(DamageGrid)
 }
}
class Equip {

}
class Faction {
action FactionsController__create {
  at__faction = create Faction
  assert (inusergroup(admin) and at__faction in Faction)
}
action FactionsController__destroy {
  at__faction = oneof(Faction)
  assert (inusergroup(admin) and at__faction in Faction)
  delete(oneof(Faction))
}
action FactionsController__edit {
  at__faction = oneof(Faction)
  assert (inusergroup(admin) and at__faction in Faction)
}
action FactionsController__index {
  at__factions = subset(Faction)
  assert (((inusergroup(admin) and at__factions in Faction) or (inusergroup(guest) and at__factions in Faction)) or at__factions in Faction)
  at__factions = Faction
}
action FactionsController__new {
  at__faction = create Faction
  assert (inusergroup(admin) and at__faction in Faction)
}
action FactionsController__update {
  at__faction = oneof(Faction)
  assert (inusergroup(admin) and at__faction in Faction)
}
}
class Mercenary {

}
class Model {
action ModelsController__add_spell {
  at__model = oneof(Model)
  assert (inusergroup(admin) and at__model in Model)
  at__spell = oneof(Spell)
  at__model.spells += at__spell
}
action ModelsController__add_weapon {
  at__model = oneof(Model)
  assert (inusergroup(admin) and at__model in Model)
  at__equip = create Equip
  at__equip.model = oneof(Model)
  at__equip.weapon = oneof(Weapon)
}
action ModelsController__create {
  at__model = create Model
  assert (inusergroup(admin) and at__model in Model)
}
action ModelsController__destroy {
  at__model = oneof(Model)
  assert (inusergroup(admin) and at__model in Model)
  delete(at__model.equips)
  delete(at__model.warcaster)
  delete(at__model.warjack)
  delete(at__model)
}
action ModelsController__edit {
  at__model = oneof(Model)
  assert (inusergroup(admin) and at__model in Model)
}
action ModelsController__index {
  at__faction = empty
  at__warcasters = empty
  at__warjacks = empty
  at__troops = empty
  at__solos = empty
  at__models = subset(Model)
  assert (((inusergroup(admin) and at__models in Model) or (inusergroup(guest) and at__models in Model)) or at__models in Model)
  if (*) {
    at__warcasters = oneof(Model)
    at__warjacks = oneof(Model)
    at__troops = Unit
    at__solos = oneof(Model)
  } else {
    at__faction = empty
    at__warcasters = oneof(Model)
    at__warjacks = oneof(Model)
    at__troops = oneof(Unit)
    at__solos = oneof(Model)
  }
}
action ModelsController__new {
  at__model = create Model
  assert (inusergroup(admin) and at__model in Model)
}
action ModelsController__show {
  at__model = oneof(Model)
  assert (((inusergroup(admin) and at__model in Model) or (inusergroup(guest) and at__model in Model)) or at__model in Model)
  at__available_weapons = subset(Weapon)
  at__available_spells = subset(Spell)
}
action ModelsController__update {
  at__model = oneof(Model)
  assert (inusergroup(admin) and at__model in Model)
}

}
class ModelOrder {

}
class ModelType {

}
class Order {
action OrdersController__create {
  at__order = create Order
  assert (inusergroup(admin) and at__order in Order)
}
action OrdersController__destroy {
  at__order = oneof(Order)
  assert (inusergroup(admin) and at__order in Order)
  delete(at__order)
}
action OrdersController__edit {
  at__order = oneof(Order)
  assert (inusergroup(admin) and at__order in Order)
}
action OrdersController__index {
  at__orders = subset(Order)
  assert (((inusergroup(admin) and at__orders in Order) or (inusergroup(guest) and at__orders in Order)) or at__orders in Order)
}
action OrdersController__new {
  at__order = create Order
  assert (inusergroup(admin) and at__order in Order)
}
action OrdersController__show {
  at__order = oneof(Order)
  assert (((inusergroup(admin) and at__order in Order) or (inusergroup(guest) and at__order in Order)) or at__order in Order)
}
action OrdersController__update {
  at__order = oneof(Order)
  assert (inusergroup(admin) and at__order in Order)
}
}
class Role {

}
class Rule {

}
class Spell {
action SpellsController__create {
  at__spell = create Spell
  assert (inusergroup(admin) and at__spell in Spell)
}
action SpellsController__destroy {
  at__spell = oneof(Spell)
  assert (inusergroup(admin) and at__spell in Spell)
  delete(at__spell)
}
action SpellsController__edit {
  at__spell = oneof(Spell)
  assert (inusergroup(admin) and at__spell in Spell)
}
action SpellsController__index {
  at__spells = subset(Spell)
  assert (((inusergroup(admin) and at__spells in Spell) or (inusergroup(guest) and at__spells in Spell)) or at__spells in Spell)
}
action SpellsController__new {
  at__spell = create Spell
  assert (inusergroup(admin) and at__spell in Spell)
}
action SpellsController__show {
  at__spell = oneof(Spell)
  assert (((inusergroup(admin) and at__spell in Spell) or (inusergroup(guest) and at__spell in Spell)) or at__spell in Spell)
}
action SpellsController__update {
  at__spell = oneof(Spell)
  assert (inusergroup(admin) and at__spell in Spell)
}
}
class SubType {
action SubTypesController__create {
  at__sub_type = create SubType
  assert (inusergroup(admin) and at__sub_type in SubType)
}
action SubTypesController__destroy {
  at__sub_type = oneof(SubType)
  assert (inusergroup(admin) and at__sub_type in SubType)
  delete(at__sub_type)
}
action SubTypesController__edit {
  at__sub_type = oneof(SubType)
  assert (inusergroup(admin) and at__sub_type in SubType)
}
action SubTypesController__index {
  at__sub_types = subset(SubType)
  assert (((inusergroup(admin) and at__sub_types in SubType) or (inusergroup(guest) and at__sub_types in SubType)) or at__sub_types in SubType)
  at__sub_types = SubType
}
action SubTypesController__new {
  at__sub_type = create SubType
  assert (inusergroup(admin) and at__sub_type in SubType)
}
action SubTypesController__update {
  at__sub_type = oneof(SubType)
  assert (inusergroup(admin) and at__sub_type in SubType)
}
}
class Trait {
action TraitsController__create {
  at__trait = create Trait
  assert (inusergroup(admin) and at__trait in Trait)
}
action TraitsController__destroy {
  at__trait = oneof(Trait)
  assert (inusergroup(admin) and at__trait in Trait)
  delete(at__trait)
}
action TraitsController__edit {
  at__trait = oneof(Trait)
  assert (inusergroup(admin) and at__trait in Trait)
}
action TraitsController__index {
  at__traits = subset(Trait)
  assert (((inusergroup(admin) and at__traits in Trait) or (inusergroup(guest) and at__traits in Trait)) or at__traits in Trait)
}
action TraitsController__new {
  at__trait = create Trait
  assert (inusergroup(admin) and at__trait in Trait)
}
action TraitsController__show {
  at__trait = oneof(Trait)
  assert (((inusergroup(admin) and at__trait in Trait) or (inusergroup(guest) and at__trait in Trait)) or at__trait in Trait)
}
action TraitsController__update {
  at__trait = oneof(Trait)
  assert (inusergroup(admin) and at__trait in Trait)
}
}
class Unit {
action UnitsController__create {
  at__unit = create Unit
  assert (inusergroup(admin) and at__unit in Unit)
}
action UnitsController__destroy {
  at__unit = oneof(Unit)
  assert (inusergroup(admin) and at__unit in Unit)
  delete(at__unit)
}
action UnitsController__edit {
  at__unit = oneof(Unit)
  assert (inusergroup(admin) and at__unit in Unit)
}
action UnitsController__new {
  at__unit = create Unit
  assert (inusergroup(admin) and at__unit in Unit)
  create(at__unit.models)
}
action UnitsController__show {
  at__unit = oneof(Unit)
  assert (((inusergroup(admin) and at__unit in Unit) or (inusergroup(guest) and at__unit in Unit)) or at__unit in Unit)
}
action UnitsController__update {
  at__unit = oneof(Unit)
  assert (inusergroup(admin) and at__unit in Unit)
}
}
class User {

}
class Warcaster {
action WarcastersController__create {
  at__model = create Model
  assert inusergroup(admin)
}
action WarcastersController__edit {
  at__model = oneof(Model)
  if (*) {
    create(at__model.warcaster)
  }
  assert inusergroup(admin)
}
action WarcastersController__new {
  at__model = create Model
  create(at__model.warcaster)
  assert inusergroup(admin)
}
action WarcastersController__show {
  at__model = oneof(Model)
  at__available_weapons = subset(Weapon)
  at__available_spells = subset(Spell)
}
action WarcastersController__update {
  at__model = oneof(Model)
  assert inusergroup(admin)
}

}
class Warjack {
action WarjacksController__create {
  at__model = create Model
  assert inusergroup(admin)
}
action WarjacksController__edit {
  at__model = oneof(Model)
  if (*) {
    create(at__model.warjack)
  }
  assert inusergroup(admin)
}
action WarjacksController__new {
  at__model = create Model
  create(at__model.warjack)
  assert inusergroup(admin)
}
action WarjacksController__show {
  at__model = oneof(Model)
}
action WarjacksController__update {
  at__model = oneof(Model)
  assert inusergroup(admin)
}
}
class Weapon {
action WeaponsController__create {
  at__weapon = create Weapon
  assert (inusergroup(admin) and at__weapon in Weapon)
}
action WeaponsController__destroy {
  at__weapon = oneof(Weapon)
  assert (inusergroup(admin) and at__weapon in Weapon)
  delete(at__weapon.equips)
  delete(at__weapon)
}
action WeaponsController__edit {
  at__weapon = oneof(Weapon)
  assert (inusergroup(admin) and at__weapon in Weapon)
}
action WeaponsController__index {
  at__weapons = subset(Weapon)
  assert (((inusergroup(admin) and at__weapons in Weapon) or (inusergroup(guest) and at__weapons in Weapon)) or at__weapons in Weapon)
}
action WeaponsController__new {
  at__weapon = create Weapon
  assert (inusergroup(admin) and at__weapon in Weapon)
}
action WeaponsController__show {
  at__weapon = oneof(Weapon)
  assert (((inusergroup(admin) and at__weapon in Weapon) or (inusergroup(guest) and at__weapon in Weapon)) or at__weapon in Weapon)
}
action WeaponsController__update {
  at__weapon = oneof(Weapon)
  assert (inusergroup(admin) and at__weapon in Weapon)
}
}
