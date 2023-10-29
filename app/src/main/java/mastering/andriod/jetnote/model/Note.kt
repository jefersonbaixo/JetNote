package mastering.andriod.jetnote.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: Long = System.currentTimeMillis(),
)
