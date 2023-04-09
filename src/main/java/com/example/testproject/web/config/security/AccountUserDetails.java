package com.example.testproject.web.config.security;

import com.example.testproject.web.model.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class AccountUserDetails implements UserDetails {

    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    //Какие права у пользователя?
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String role = account.getRole().name();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
        return Collections.singleton(authority);
    }

    //Какой пароль у пользователя?
    @Override
    public String getPassword() {
        return account.getPassword();
    }

    //Какой username у пользователя?
    @Override
    public String getUsername() {
        return account.getEmail();
    }

    //Не просрочен ли аккаунт?
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //Не заблокирован ли аккаунт?
    @Override
    public boolean isAccountNonLocked() {
        return !account.getState().equals(Account.State.BANNED);
    }

    //Не просрочены ли креды?
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //Активен ли аккаунт?
    @Override
    public boolean isEnabled() {
        return account.getState().equals(Account.State.CONFIRMED);
    }
}
