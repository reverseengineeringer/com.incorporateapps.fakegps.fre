package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzms;

public final class EventEntity
  implements SafeParcelable, Event
{
  public static final EventEntityCreator CREATOR = new EventEntityCreator();
  private final String mName;
  private final int mVersionCode;
  private final Uri zzaCd;
  private final String zzaCo;
  private final String zzaDU;
  private final long zzaDV;
  private final String zzaDW;
  private final PlayerEntity zzaDq;
  private final String zzaxl;
  private final boolean zzsj;
  
  EventEntity(int paramInt, String paramString1, String paramString2, String paramString3, Uri paramUri, String paramString4, Player paramPlayer, long paramLong, String paramString5, boolean paramBoolean)
  {
    mVersionCode = paramInt;
    zzaDU = paramString1;
    mName = paramString2;
    zzaxl = paramString3;
    zzaCd = paramUri;
    zzaCo = paramString4;
    zzaDq = new PlayerEntity(paramPlayer);
    zzaDV = paramLong;
    zzaDW = paramString5;
    zzsj = paramBoolean;
  }
  
  public EventEntity(Event paramEvent)
  {
    mVersionCode = 1;
    zzaDU = paramEvent.getEventId();
    mName = paramEvent.getName();
    zzaxl = paramEvent.getDescription();
    zzaCd = paramEvent.getIconImageUri();
    zzaCo = paramEvent.getIconImageUrl();
    zzaDq = ((PlayerEntity)paramEvent.getPlayer().freeze());
    zzaDV = paramEvent.getValue();
    zzaDW = paramEvent.getFormattedValue();
    zzsj = paramEvent.isVisible();
  }
  
  static int zza(Event paramEvent)
  {
    return zzw.hashCode(new Object[] { paramEvent.getEventId(), paramEvent.getName(), paramEvent.getDescription(), paramEvent.getIconImageUri(), paramEvent.getIconImageUrl(), paramEvent.getPlayer(), Long.valueOf(paramEvent.getValue()), paramEvent.getFormattedValue(), Boolean.valueOf(paramEvent.isVisible()) });
  }
  
  static boolean zza(Event paramEvent, Object paramObject)
  {
    if (!(paramObject instanceof Event)) {}
    do
    {
      return false;
      if (paramEvent == paramObject) {
        return true;
      }
      paramObject = (Event)paramObject;
    } while ((!zzw.equal(((Event)paramObject).getEventId(), paramEvent.getEventId())) || (!zzw.equal(((Event)paramObject).getName(), paramEvent.getName())) || (!zzw.equal(((Event)paramObject).getDescription(), paramEvent.getDescription())) || (!zzw.equal(((Event)paramObject).getIconImageUri(), paramEvent.getIconImageUri())) || (!zzw.equal(((Event)paramObject).getIconImageUrl(), paramEvent.getIconImageUrl())) || (!zzw.equal(((Event)paramObject).getPlayer(), paramEvent.getPlayer())) || (!zzw.equal(Long.valueOf(((Event)paramObject).getValue()), Long.valueOf(paramEvent.getValue()))) || (!zzw.equal(((Event)paramObject).getFormattedValue(), paramEvent.getFormattedValue())) || (!zzw.equal(Boolean.valueOf(((Event)paramObject).isVisible()), Boolean.valueOf(paramEvent.isVisible()))));
    return true;
  }
  
  static String zzb(Event paramEvent)
  {
    return zzw.zzy(paramEvent).zzg("Id", paramEvent.getEventId()).zzg("Name", paramEvent.getName()).zzg("Description", paramEvent.getDescription()).zzg("IconImageUri", paramEvent.getIconImageUri()).zzg("IconImageUrl", paramEvent.getIconImageUrl()).zzg("Player", paramEvent.getPlayer()).zzg("Value", Long.valueOf(paramEvent.getValue())).zzg("FormattedValue", paramEvent.getFormattedValue()).zzg("isVisible", Boolean.valueOf(paramEvent.isVisible())).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Event freeze()
  {
    return this;
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final void getDescription(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaxl, paramCharArrayBuffer);
  }
  
  public final String getEventId()
  {
    return zzaDU;
  }
  
  public final String getFormattedValue()
  {
    return zzaDW;
  }
  
  public final void getFormattedValue(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(zzaDW, paramCharArrayBuffer);
  }
  
  public final Uri getIconImageUri()
  {
    return zzaCd;
  }
  
  public final String getIconImageUrl()
  {
    return zzaCo;
  }
  
  public final String getName()
  {
    return mName;
  }
  
  public final void getName(CharArrayBuffer paramCharArrayBuffer)
  {
    zzms.zzb(mName, paramCharArrayBuffer);
  }
  
  public final Player getPlayer()
  {
    return zzaDq;
  }
  
  public final long getValue()
  {
    return zzaDV;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final boolean isVisible()
  {
    return zzsj;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    EventEntityCreator.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.event.EventEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */