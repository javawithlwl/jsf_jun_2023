package com.careerit.lsdj.service;

import com.careerit.lsdj.domain.Wallet;
import com.careerit.lsdj.dto.WalletDto;
import com.careerit.lsdj.repo.WalletRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService{

    private final WalletRepo walletRepo;

    @Override
    public List<WalletDto> getAllWallets() {
        List<Wallet> wallets = walletRepo.findAll();
        List<WalletDto> walletDtoList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(wallets)){
            walletDtoList = resolveWalletList(wallets);
        }
        return walletDtoList;
    }

    private List<WalletDto> resolveWalletList(List<Wallet> wallets) {
        List<WalletDto> list = new ArrayList<>();
        for(Wallet wallet:wallets){
            WalletDto walletDto = new WalletDto();
            walletDto.setId(wallet.getId());
            walletDto.setName(wallet.getName());
            walletDto.setBalance(wallet.getBalance());
            walletDto.setValidThru(wallet.getValidThru());
            walletDto.setDeleted(wallet.isDeleted());
            walletDto.setCreatedBy(wallet.getCreatedBy());
            walletDto.setModifiedBy(wallet.getModifiedBy());
            walletDto.setMobile(wallet.getMobile());
            walletDto.setCreatedUser(UserRequestService.getUserName(wallet.getCreatedBy()));
            walletDto.setModifiedUser(UserRequestService.getUserName(wallet.getModifiedBy()));
            walletDto.setCreatedDate(wallet.getCreateDate());
            walletDto.setModifiedDate(wallet.getModifiedDate());
            list.add(walletDto);
        }
        return list;
    }
}
