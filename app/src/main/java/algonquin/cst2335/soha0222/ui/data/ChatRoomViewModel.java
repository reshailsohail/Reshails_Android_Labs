package algonquin.cst2335.soha0222.ui.data;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import algonquin.cst2335.soha0222.ChatRoom.ChatMessage;
public class ChatRoomViewModel extends ViewModel {
    public MutableLiveData<ArrayList<ChatMessage>> messages = new MutableLiveData<>();
}