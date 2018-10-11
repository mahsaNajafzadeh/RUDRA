class Account < ApplicationRecord
  belongs_to :user

  validates_presence_of :name, :user

  def self.open(params)
    account = new(params)
    puts "Creating a account with #{account.attributes}"
    account.save!
  end

  def self.deposit(account, amount)
    puts "Depositing #{amount} on account #{account.id}"
    return false unless self.amount_valid?(amount)
    account.balance  += amount
    account.save!
  end

  def self.withdraw(account, amount)
    puts "Withdrawing #{amount} on account #{account.id}"
    return false unless self.amount_valid?(amount)
    account.balance -= amount
    account.save!
  end

  def self.transfer(account, recipient, amount)
    puts "Transfering #{amount} from account #{account.id} to account #{recipient.id}"
    return false unless self.amount_valid?(amount)
    transaction do
      self.withdraw(account, amount)
      self.deposit(recipient, amount)
    end
  end

  def self.amount_valid?(amount)
    if amount <= 0
      puts 'Transaction failed! Amount must be greater than 0.00'
      return false
    end
    return true
  end
end
class User < ApplicationRecord
  def create
    user = new(params)
    user.save!
  end
    def delet
      destroy
    end
end


