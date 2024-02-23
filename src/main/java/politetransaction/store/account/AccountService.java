package politetransaction.store.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public Account read(String id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account login (String email, String hash) {
        return accountRepository.findByEmailAndHash(email, hash).orElse(null);
    }

    public Account calculatedHash (String id, String hash) {
        messageDigest.update(hash.getBytes());
        byte[] digest = messageDigest.digest();
        // encode the hash in base 64
        // TODO
        return accountRepository.updateHash(id, digest);
    }


    
}
