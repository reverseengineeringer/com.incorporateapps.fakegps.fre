package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;

final class GamesClientImpl$LoadProfileSettingsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Players.LoadProfileSettingsResult
{
  private final boolean zzaEK;
  private final boolean zzsj;
  
  /* Error */
  GamesClientImpl$LoadProfileSettingsResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial 13	com/google/android/gms/games/internal/GamesClientImpl$GamesDataHolderResult:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   5: aload_1
    //   6: invokevirtual 19	com/google/android/gms/common/data/DataHolder:getCount	()I
    //   9: ifle +38 -> 47
    //   12: aload_1
    //   13: iconst_0
    //   14: invokevirtual 23	com/google/android/gms/common/data/DataHolder:zzbH	(I)I
    //   17: istore_2
    //   18: aload_0
    //   19: aload_1
    //   20: ldc 25
    //   22: iconst_0
    //   23: iload_2
    //   24: invokevirtual 29	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   27: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzsj	Z
    //   30: aload_0
    //   31: aload_1
    //   32: ldc 33
    //   34: iconst_0
    //   35: iload_2
    //   36: invokevirtual 29	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   39: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzaEK	Z
    //   42: aload_1
    //   43: invokevirtual 39	com/google/android/gms/common/data/DataHolder:close	()V
    //   46: return
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzsj	Z
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 35	com/google/android/gms/games/internal/GamesClientImpl$LoadProfileSettingsResultImpl:zzaEK	Z
    //   57: goto -15 -> 42
    //   60: astore_3
    //   61: aload_1
    //   62: invokevirtual 39	com/google/android/gms/common/data/DataHolder:close	()V
    //   65: aload_3
    //   66: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	this	LoadProfileSettingsResultImpl
    //   0	67	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   17	19	2	i	int
    //   60	6	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   5	42	60	finally
    //   47	57	60	finally
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.LoadProfileSettingsResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */