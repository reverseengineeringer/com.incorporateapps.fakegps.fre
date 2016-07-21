package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;

final class GamesClientImpl$GameMuteStatusLoadResultImpl
  implements Notifications.GameMuteStatusLoadResult
{
  private final Status zzUX;
  private final String zzaEq;
  private final boolean zzaEr;
  
  /* Error */
  public GamesClientImpl$GameMuteStatusLoadResultImpl(com.google.android.gms.common.data.DataHolder paramDataHolder)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokevirtual 23	com/google/android/gms/common/data/DataHolder:getStatusCode	()I
    //   9: invokestatic 29	com/google/android/gms/games/GamesStatusCodes:zzgc	(I)Lcom/google/android/gms/common/api/Status;
    //   12: putfield 31	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzUX	Lcom/google/android/gms/common/api/Status;
    //   15: aload_1
    //   16: invokevirtual 34	com/google/android/gms/common/data/DataHolder:getCount	()I
    //   19: ifle +32 -> 51
    //   22: aload_0
    //   23: aload_1
    //   24: ldc 36
    //   26: iconst_0
    //   27: iconst_0
    //   28: invokevirtual 40	com/google/android/gms/common/data/DataHolder:zzd	(Ljava/lang/String;II)Ljava/lang/String;
    //   31: putfield 42	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEq	Ljava/lang/String;
    //   34: aload_0
    //   35: aload_1
    //   36: ldc 44
    //   38: iconst_0
    //   39: iconst_0
    //   40: invokevirtual 48	com/google/android/gms/common/data/DataHolder:zze	(Ljava/lang/String;II)Z
    //   43: putfield 50	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEr	Z
    //   46: aload_1
    //   47: invokevirtual 53	com/google/android/gms/common/data/DataHolder:close	()V
    //   50: return
    //   51: aload_0
    //   52: aconst_null
    //   53: putfield 42	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEq	Ljava/lang/String;
    //   56: aload_0
    //   57: iconst_0
    //   58: putfield 50	com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadResultImpl:zzaEr	Z
    //   61: goto -15 -> 46
    //   64: astore_2
    //   65: aload_1
    //   66: invokevirtual 53	com/google/android/gms/common/data/DataHolder:close	()V
    //   69: aload_2
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	GameMuteStatusLoadResultImpl
    //   0	71	1	paramDataHolder	com.google.android.gms.common.data.DataHolder
    //   64	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	46	64	finally
    //   51	61	64	finally
  }
  
  public final Status getStatus()
  {
    return zzUX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.GamesClientImpl.GameMuteStatusLoadResultImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */