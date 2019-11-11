package com.example.computer_networking_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessorAdapter extends FragmentPagerAdapter {

    public TabAccessorAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
//            case 0:
//                ChatsFragment chatsFragment = new ChatsFragment();
//                return chatsFragment;
            case 0:
                GroupsFragment groupsFragment = new GroupsFragment();
                return groupsFragment;
            case 1:
                ContactsFragment contactsFragment = new ContactsFragment();
                return contactsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
//            case 0:
//                return "Chats";
            case 0:
                return "Groups";
            case 1:
                return "Contacts";
            default:
                return null;
        }
    }
}