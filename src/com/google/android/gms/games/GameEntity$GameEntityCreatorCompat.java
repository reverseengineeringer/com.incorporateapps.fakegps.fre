package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

final class GameEntity$GameEntityCreatorCompat
  extends GameEntityCreator
{
  public final GameEntity zzea(Parcel paramParcel)
  {
    if ((GameEntity.zzc(GameEntity.zzvC())) || (GameEntity.zzdG(GameEntity.class.getCanonicalName()))) {
      return super.zzea(paramParcel);
    }
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    String str5 = paramParcel.readString();
    String str6 = paramParcel.readString();
    Object localObject1 = paramParcel.readString();
    Object localObject2;
    label90:
    Object localObject3;
    label104:
    boolean bool1;
    if (localObject1 == null)
    {
      localObject1 = null;
      localObject2 = paramParcel.readString();
      if (localObject2 != null) {
        break label188;
      }
      localObject2 = null;
      localObject3 = paramParcel.readString();
      if (localObject3 != null) {
        break label198;
      }
      localObject3 = null;
      if (paramParcel.readInt() <= 0) {
        break label208;
      }
      bool1 = true;
      label113:
      if (paramParcel.readInt() <= 0) {
        break label213;
      }
    }
    label188:
    label198:
    label208:
    label213:
    for (boolean bool2 = true;; bool2 = false)
    {
      return new GameEntity(7, str1, str2, str3, str4, str5, str6, (Uri)localObject1, (Uri)localObject2, (Uri)localObject3, bool1, bool2, paramParcel.readString(), paramParcel.readInt(), paramParcel.readInt(), paramParcel.readInt(), false, false, null, null, null, false, false, false, null, false);
      localObject1 = Uri.parse((String)localObject1);
      break;
      localObject2 = Uri.parse((String)localObject2);
      break label90;
      localObject3 = Uri.parse((String)localObject3);
      break label104;
      bool1 = false;
      break label113;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.GameEntity.GameEntityCreatorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */