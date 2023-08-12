package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.Wallet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class WalletRepoTest {

    @Autowired
    private WalletRepo walletRepo;

    @BeforeEach
    public void init(){
        walletRepo.deleteAll();
    }

    @Test
    public void addWalletTest(){
        Wallet wallet = getWallet();
        Wallet savedWallet = walletRepo.save(wallet);
        Assertions.assertNotNull(savedWallet.getId());
    }
    @Test
    public void addWalletsTest(){
        List<Wallet> wallets = getWallets();
        List<Wallet> savedWallets = walletRepo.saveAll(wallets);
        long count = walletRepo.count();
        Assertions.assertEquals(2,count);
    }

    @Test
    public void updateWalletTest(){
        Wallet wallet = getWallet();
        Wallet savedWallet = walletRepo.save(wallet);
        savedWallet.setBalance(2000);
        Wallet updatedWallet = walletRepo.save(savedWallet);
        Assertions.assertEquals(2000,updatedWallet.getBalance());
    }

    private Wallet getWallet(){
        Wallet wallet = new Wallet();
        wallet.setBalance(1000);
        wallet.setName("Krish");
        wallet.setMobile("9876543210");
        wallet.setValidThru(LocalDate.now().plusYears(4));
        return wallet;
    }
    private List<Wallet> getWallets(){
        Wallet wallet1 = new Wallet();
        wallet1.setBalance(1000);
        wallet1.setName("Krish");
        wallet1.setMobile("9876543210");
        wallet1.setValidThru(LocalDate.now().plusYears(4));

        Wallet wallet2 = new Wallet();
        wallet2.setBalance(1000);
        wallet2.setName("Manoj");
        wallet2.setMobile("9876543211");
        wallet2.setValidThru(LocalDate.now().plusYears(4));
        return List.of(wallet1,wallet2);
    }

}
