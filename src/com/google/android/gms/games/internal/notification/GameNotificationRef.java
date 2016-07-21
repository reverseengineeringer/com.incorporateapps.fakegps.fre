package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;

public final class GameNotificationRef
  extends zzc
  implements GameNotification
{
  GameNotificationRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public final long getId()
  {
    return getLong("_id");
  }
  
  public final String getText()
  {
    return getString("text");
  }
  
  public final String getTitle()
  {
    return getString("title");
  }
  
  public final int getType()
  {
    return getInteger("type");
  }
  
  public final String toString()
  {
    return zzw.zzy(this).zzg("Id", Long.valueOf(getId())).zzg("NotificationId", zzxt()).zzg("Type", Integer.valueOf(getType())).zzg("Title", getTitle()).zzg("Ticker", zzxu()).zzg("Text", getText()).zzg("CoalescedText", zzxv()).zzg("isAcknowledged", Boolean.valueOf(zzxw())).zzg("isSilent", Boolean.valueOf(zzxx())).toString();
  }
  
  public final String zzxt()
  {
    return getString("notification_id");
  }
  
  public final String zzxu()
  {
    return getString("ticker");
  }
  
  public final String zzxv()
  {
    return getString("coalesced_text");
  }
  
  public final boolean zzxw()
  {
    return getInteger("acknowledged") > 0;
  }
  
  public final boolean zzxx()
  {
    return getInteger("alert_level") == 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.notification.GameNotificationRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */