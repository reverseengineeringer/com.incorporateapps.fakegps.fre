package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class PlayerEntity$PlayerEntityCreatorCompat
  extends PlayerEntityCreator
{
  public final PlayerEntity zzeb(Parcel paramParcel)
  {
    if ((PlayerEntity.zzc(PlayerEntity.zzvC())) || (PlayerEntity.zzdG(PlayerEntity.class.getCanonicalName()))) {
      return super.zzeb(paramParcel);
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    Object localObject1 = paramParcel.readString();
    Object localObject2 = paramParcel.readString();
    if (localObject1 == null)
    {
      localObject1 = null;
      if (localObject2 != null) {
        break label111;
      }
    }
    label111:
    for (localObject2 = null;; localObject2 = Uri.parse((String)localObject2))
    {
      return new PlayerEntity(13, str1, str2, (Uri)localObject1, (Uri)localObject2, paramParcel.readLong(), -1, -1L, null, null, null, null, null, true, false, paramParcel.readString(), paramParcel.readString(), null, null, null, null);
      localObject1 = Uri.parse((String)localObject1);
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerEntity.PlayerEntityCreatorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */