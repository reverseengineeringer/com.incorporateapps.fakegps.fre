package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

public final class QuestRef
  extends zzc
  implements Quest
{
  private final int zzaDQ;
  private final Game zzaJc;
  
  QuestRef(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    zzaJc = new GameRef(paramDataHolder, paramInt1);
    zzaDQ = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return QuestEntity.zza(this, paramObject);
  }
  
  public final Quest freeze()
  {
    return new QuestEntity(this);
  }
  
  public final long getAcceptedTimestamp()
  {
    return getLong("accepted_ts");
  }
  
  public final Uri getBannerImageUri()
  {
    return zzcA("quest_banner_image_uri");
  }
  
  public final String getBannerImageUrl()
  {
    return getString("quest_banner_image_url");
  }
  
  public final Milestone getCurrentMilestone()
  {
    return (Milestone)zzxR().get(0);
  }
  
  public final String getDescription()
  {
    return getString("quest_description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("quest_description", paramCharArrayBuffer);
  }
  
  public final long getEndTimestamp()
  {
    return getLong("quest_end_ts");
  }
  
  public final Game getGame()
  {
    return zzaJc;
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA("quest_icon_image_uri");
  }
  
  public final String getIconImageUrl()
  {
    return getString("quest_icon_image_url");
  }
  
  public final long getLastUpdatedTimestamp()
  {
    return getLong("quest_last_updated_ts");
  }
  
  public final String getName()
  {
    return getString("quest_name");
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("quest_name", paramCharArrayBuffer);
  }
  
  public final String getQuestId()
  {
    return getString("external_quest_id");
  }
  
  public final long getStartTimestamp()
  {
    return getLong("quest_start_ts");
  }
  
  public final int getState()
  {
    return getInteger("quest_state");
  }
  
  public final int getType()
  {
    return getInteger("quest_type");
  }
  
  public final int hashCode()
  {
    return QuestEntity.zza(this);
  }
  
  public final boolean isEndingSoon()
  {
    return zzxS() <= System.currentTimeMillis() + 1800000L;
  }
  
  public final String toString()
  {
    return QuestEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((QuestEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public final List zzxR()
  {
    ArrayList localArrayList = new ArrayList(zzaDQ);
    int i = 0;
    while (i < zzaDQ)
    {
      localArrayList.add(new MilestoneRef(zzahi, zzaje + i));
      i += 1;
    }
    return localArrayList;
  }
  
  public final long zzxS()
  {
    return getLong("notification_ts");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.quest.QuestRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */