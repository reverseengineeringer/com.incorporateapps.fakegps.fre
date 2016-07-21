package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class EventRef
  extends zzc
  implements Event
{
  EventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return EventEntity.zza(this, paramObject);
  }
  
  public final Event freeze()
  {
    return new EventEntity(this);
  }
  
  public final String getDescription()
  {
    return getString("description");
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("description", paramCharArrayBuffer);
  }
  
  public final String getEventId()
  {
    return getString("external_event_id");
  }
  
  public final String getFormattedValue()
  {
    return getString("formatted_value");
  }
  
  public final void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("formatted_value", paramCharArrayBuffer);
  }
  
  public final Uri getIconImageUri()
  {
    return zzcA("icon_image_uri");
  }
  
  public final String getIconImageUrl()
  {
    return getString("icon_image_url");
  }
  
  public final String getName()
  {
    return getString("name");
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zza("name", paramCharArrayBuffer);
  }
  
  public final Player getPlayer()
  {
    return new PlayerRef(zzahi, zzaje);
  }
  
  public final long getValue()
  {
    return getLong("value");
  }
  
  public final int hashCode()
  {
    return EventEntity.zza(this);
  }
  
  public final boolean isVisible()
  {
    return getBoolean("visibility");
  }
  
  public final String toString()
  {
    return EventEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((EventEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.event.EventRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */