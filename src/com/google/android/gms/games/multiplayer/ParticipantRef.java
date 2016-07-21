package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef
  extends zzc
  implements Participant
{
  private final PlayerRef zzaJO;
  
  public ParticipantRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    zzaJO = new PlayerRef(paramDataHolder, paramInt);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ParticipantEntity.zza(this, paramObject);
  }
  
  public final Participant freeze()
  {
    return new ParticipantEntity(this);
  }
  
  public final int getCapabilities()
  {
    return getInteger("capabilities");
  }
  
  public final String getDisplayName()
  {
    if (zzcB("external_player_id")) {
      return getString("default_display_name");
    }
    return zzaJO.getDisplayName();
  }
  
  public final void getDisplayName(CharArrayBuffer paramCharArrayBuffer)
  {
    if (zzcB("external_player_id"))
    {
      zza("default_display_name", paramCharArrayBuffer);
      return;
    }
    zzaJO.getDisplayName(paramCharArrayBuffer);
  }
  
  public final Uri getHiResImageUri()
  {
    if (zzcB("external_player_id")) {
      return zzcA("default_display_hi_res_image_uri");
    }
    return zzaJO.getHiResImageUri();
  }
  
  public final String getHiResImageUrl()
  {
    if (zzcB("external_player_id")) {
      return getString("default_display_hi_res_image_url");
    }
    return zzaJO.getHiResImageUrl();
  }
  
  public final Uri getIconImageUri()
  {
    if (zzcB("external_player_id")) {
      return zzcA("default_display_image_uri");
    }
    return zzaJO.getIconImageUri();
  }
  
  public final String getIconImageUrl()
  {
    if (zzcB("external_player_id")) {
      return getString("default_display_image_url");
    }
    return zzaJO.getIconImageUrl();
  }
  
  public final String getParticipantId()
  {
    return getString("external_participant_id");
  }
  
  public final Player getPlayer()
  {
    if (zzcB("external_player_id")) {
      return null;
    }
    return zzaJO;
  }
  
  public final ParticipantResult getResult()
  {
    if (zzcB("result_type")) {
      return null;
    }
    int i = getInteger("result_type");
    int j = getInteger("placing");
    return new ParticipantResult(getParticipantId(), i, j);
  }
  
  public final int getStatus()
  {
    return getInteger("player_status");
  }
  
  public final int hashCode()
  {
    return ParticipantEntity.zza(this);
  }
  
  public final boolean isConnectedToRoom()
  {
    return getInteger("connected") > 0;
  }
  
  public final String toString()
  {
    return ParticipantEntity.zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((ParticipantEntity)freeze()).writeToParcel(paramParcel, paramInt);
  }
  
  public final String zzwt()
  {
    return getString("client_address");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.ParticipantRef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */