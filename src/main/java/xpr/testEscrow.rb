class Account < ApplicationRecord
  belongs_to :user


  validates_numericality_of :balance , greater_than_or_equal_to: a

   def self.withdraw(account, amount)
      puts "Withdrawing #{amount} on account #{account.id}"
      return false unless self.amount_valid?(amount)
      acquire_escrow(account, balance, a, GE)
      return false unless self.escrow_valid?(account, amount)
      account.balance  -= amount
      account.save!
    end
    def self.amount_valid?(amount)
        if amount <= 0
          puts "Transaction failed! Amount must be greater than 0.00"
          return false
        end
        return true
     end
     def self.escrow_valid?(escrow, amount)
              if escrow <= amount
                puts "Transaction failed! Amount must be greater than 0.00"
                return false
              end
              return true
    end

 end

