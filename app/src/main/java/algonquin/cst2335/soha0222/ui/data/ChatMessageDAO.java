package algonquin.cst2335.soha0222.ui.data;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;

@Dao
public interface ChatMessageDAO {
    @Insert
    void insertMessage(ChatMessage m);
    @Query("Select * from ChatMessage")
    List<ChatMessage> getAllMessages();
    @Delete
    void deleteMessage(ChatMessage m);
}