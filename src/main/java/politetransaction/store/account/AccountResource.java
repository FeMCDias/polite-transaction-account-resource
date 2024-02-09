package politetransaction.store.account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountResource implements AccountController{
    @GetMapping("/accounts/info")
    public String info(){
        return "Account Info";
    }

    @Override
    public ResponseEntity<AccountOut> create(AccountIn in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<AccountOut> update(String id, AccountIn in) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
