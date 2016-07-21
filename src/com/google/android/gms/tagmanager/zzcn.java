package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzrq.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zzg;
import com.google.android.gms.internal.zzst;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class zzcn
  implements zzp.zzf
{
  private final Context mContext;
  private final String zzbhM;
  private zzbf zzbkg;
  private final ExecutorService zzbkn;
  
  zzcn(Context paramContext, String paramString)
  {
    mContext = paramContext;
    zzbhM = paramString;
    zzbkn = Executors.newSingleThreadExecutor();
  }
  
  private zzrs.zzc zza(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    try
    {
      paramByteArrayOutputStream = zzaz.zzgi(paramByteArrayOutputStream.toString("UTF-8"));
      return paramByteArrayOutputStream;
    }
    catch (UnsupportedEncodingException paramByteArrayOutputStream)
    {
      zzbg.zzaI("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
      return null;
    }
    catch (JSONException paramByteArrayOutputStream)
    {
      zzbg.zzaK("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
    }
    return null;
  }
  
  private void zzd(zzrq.zza paramzza)
  {
    if ((zzju == null) && (zzbme == null)) {
      throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
    }
  }
  
  private zzrs.zzc zzx(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = zzrs.zzb(zzaf.zzf.zzc(paramArrayOfByte));
      if (paramArrayOfByte != null) {
        zzbg.v("The container was successfully loaded from the resource (using binary file)");
      }
      return paramArrayOfByte;
    }
    catch (zzst paramArrayOfByte)
    {
      zzbg.e("The resource file is corrupted. The container cannot be extracted from the binary file");
      return null;
    }
    catch (zzrs.zzg paramArrayOfByte)
    {
      zzbg.zzaK("The resource file is invalid. The container from the binary file is invalid");
    }
    return null;
  }
  
  public void release()
  {
    try
    {
      zzbkn.shutdown();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void zzGl()
  {
    zzbkn.execute(new zzcn.1(this));
  }
  
  /* Error */
  void zzHc()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   4: ifnonnull +13 -> 17
    //   7: new 138	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc -116
    //   13: invokespecial 141	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: aload_0
    //   18: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   21: invokeinterface 146 1 0
    //   26: ldc -108
    //   28: invokestatic 106	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   31: invokestatic 154	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   34: invokevirtual 158	com/google/android/gms/tagmanager/zzcb:zzGV	()Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   37: getstatic 164	com/google/android/gms/tagmanager/zzcb$zza:zzbjV	Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   40: if_acmpeq +15 -> 55
    //   43: invokestatic 154	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   46: invokevirtual 158	com/google/android/gms/tagmanager/zzcb:zzGV	()Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   49: getstatic 167	com/google/android/gms/tagmanager/zzcb$zza:zzbjW	Lcom/google/android/gms/tagmanager/zzcb$zza;
    //   52: if_acmpne +32 -> 84
    //   55: aload_0
    //   56: getfield 23	com/google/android/gms/tagmanager/zzcn:zzbhM	Ljava/lang/String;
    //   59: invokestatic 154	com/google/android/gms/tagmanager/zzcb:zzGU	()Lcom/google/android/gms/tagmanager/zzcb;
    //   62: invokevirtual 171	com/google/android/gms/tagmanager/zzcb:getContainerId	()Ljava/lang/String;
    //   65: invokevirtual 177	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: ifeq +16 -> 84
    //   71: aload_0
    //   72: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   75: getstatic 183	com/google/android/gms/tagmanager/zzbf$zza:zzbju	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   78: invokeinterface 186 2 0
    //   83: return
    //   84: new 188	java/io/FileInputStream
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 192	com/google/android/gms/tagmanager/zzcn:zzHd	()Ljava/io/File;
    //   92: invokespecial 195	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   95: astore_1
    //   96: new 42	java/io/ByteArrayOutputStream
    //   99: dup
    //   100: invokespecial 196	java/io/ByteArrayOutputStream:<init>	()V
    //   103: astore_2
    //   104: aload_1
    //   105: aload_2
    //   106: invokestatic 199	com/google/android/gms/internal/zzrs:zzb	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   109: aload_2
    //   110: invokevirtual 203	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   113: invokestatic 207	com/google/android/gms/internal/zzrq$zza:zzy	([B)Lcom/google/android/gms/internal/zzrq$zza;
    //   116: astore_2
    //   117: aload_0
    //   118: aload_2
    //   119: invokespecial 209	com/google/android/gms/tagmanager/zzcn:zzd	(Lcom/google/android/gms/internal/zzrq$zza;)V
    //   122: aload_0
    //   123: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   126: aload_2
    //   127: invokeinterface 213 2 0
    //   132: aload_1
    //   133: invokevirtual 216	java/io/FileInputStream:close	()V
    //   136: ldc -38
    //   138: invokestatic 106	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   141: return
    //   142: astore_1
    //   143: ldc -36
    //   145: invokestatic 60	com/google/android/gms/tagmanager/zzbg:zzaI	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   152: getstatic 183	com/google/android/gms/tagmanager/zzbf$zza:zzbju	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   155: invokeinterface 186 2 0
    //   160: return
    //   161: astore_1
    //   162: ldc -34
    //   164: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   167: goto -31 -> 136
    //   170: astore_2
    //   171: aload_0
    //   172: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   175: getstatic 225	com/google/android/gms/tagmanager/zzbf$zza:zzbjv	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   178: invokeinterface 186 2 0
    //   183: ldc -29
    //   185: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   188: aload_1
    //   189: invokevirtual 216	java/io/FileInputStream:close	()V
    //   192: goto -56 -> 136
    //   195: astore_1
    //   196: ldc -34
    //   198: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   201: goto -65 -> 136
    //   204: astore_2
    //   205: aload_0
    //   206: getfield 136	com/google/android/gms/tagmanager/zzcn:zzbkg	Lcom/google/android/gms/tagmanager/zzbf;
    //   209: getstatic 225	com/google/android/gms/tagmanager/zzbf$zza:zzbjv	Lcom/google/android/gms/tagmanager/zzbf$zza;
    //   212: invokeinterface 186 2 0
    //   217: ldc -27
    //   219: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   222: aload_1
    //   223: invokevirtual 216	java/io/FileInputStream:close	()V
    //   226: goto -90 -> 136
    //   229: astore_1
    //   230: ldc -34
    //   232: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   235: goto -99 -> 136
    //   238: astore_2
    //   239: aload_1
    //   240: invokevirtual 216	java/io/FileInputStream:close	()V
    //   243: aload_2
    //   244: athrow
    //   245: astore_1
    //   246: ldc -34
    //   248: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   251: goto -8 -> 243
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	this	zzcn
    //   95	38	1	localFileInputStream	java.io.FileInputStream
    //   142	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   161	28	1	localIOException1	java.io.IOException
    //   195	28	1	localIOException2	java.io.IOException
    //   229	11	1	localIOException3	java.io.IOException
    //   245	1	1	localIOException4	java.io.IOException
    //   103	24	2	localObject1	Object
    //   170	1	2	localIOException5	java.io.IOException
    //   204	1	2	localIllegalArgumentException	IllegalArgumentException
    //   238	6	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   84	96	142	java/io/FileNotFoundException
    //   132	136	161	java/io/IOException
    //   96	132	170	java/io/IOException
    //   188	192	195	java/io/IOException
    //   96	132	204	java/lang/IllegalArgumentException
    //   222	226	229	java/io/IOException
    //   96	132	238	finally
    //   171	188	238	finally
    //   205	222	238	finally
    //   239	243	245	java/io/IOException
  }
  
  File zzHd()
  {
    String str = "resource_" + zzbhM;
    return new File(mContext.getDir("google_tagmanager", 0), str);
  }
  
  public void zza(zzbf paramzzbf)
  {
    zzbkg = paramzzbf;
  }
  
  public void zzb(zzrq.zza paramzza)
  {
    zzbkn.execute(new zzcn.2(this, paramzza));
  }
  
  /* Error */
  boolean zzc(zzrq.zza paramzza)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 192	com/google/android/gms/tagmanager/zzcn:zzHd	()Ljava/io/File;
    //   4: astore_3
    //   5: new 262	java/io/FileOutputStream
    //   8: dup
    //   9: aload_3
    //   10: invokespecial 263	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   13: astore_2
    //   14: aload_2
    //   15: aload_1
    //   16: invokestatic 268	com/google/android/gms/internal/zzsu:toByteArray	(Lcom/google/android/gms/internal/zzsu;)[B
    //   19: invokevirtual 272	java/io/FileOutputStream:write	([B)V
    //   22: aload_2
    //   23: invokevirtual 273	java/io/FileOutputStream:close	()V
    //   26: iconst_1
    //   27: ireturn
    //   28: astore_1
    //   29: ldc_w 275
    //   32: invokestatic 111	com/google/android/gms/tagmanager/zzbg:e	(Ljava/lang/String;)V
    //   35: iconst_0
    //   36: ireturn
    //   37: astore_1
    //   38: ldc_w 277
    //   41: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   44: goto -18 -> 26
    //   47: astore_1
    //   48: ldc_w 279
    //   51: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   54: aload_3
    //   55: invokevirtual 283	java/io/File:delete	()Z
    //   58: pop
    //   59: aload_2
    //   60: invokevirtual 273	java/io/FileOutputStream:close	()V
    //   63: iconst_0
    //   64: ireturn
    //   65: astore_1
    //   66: ldc_w 277
    //   69: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   72: iconst_0
    //   73: ireturn
    //   74: astore_1
    //   75: aload_2
    //   76: invokevirtual 273	java/io/FileOutputStream:close	()V
    //   79: aload_1
    //   80: athrow
    //   81: astore_2
    //   82: ldc_w 277
    //   85: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   88: goto -9 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	zzcn
    //   0	91	1	paramzza	zzrq.zza
    //   13	63	2	localFileOutputStream	java.io.FileOutputStream
    //   81	1	2	localIOException	java.io.IOException
    //   4	51	3	localFile	File
    // Exception table:
    //   from	to	target	type
    //   5	14	28	java/io/FileNotFoundException
    //   22	26	37	java/io/IOException
    //   14	22	47	java/io/IOException
    //   59	63	65	java/io/IOException
    //   14	22	74	finally
    //   48	59	74	finally
    //   75	79	81	java/io/IOException
  }
  
  /* Error */
  public zzrs.zzc zzke(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	com/google/android/gms/tagmanager/zzcn:mContext	Landroid/content/Context;
    //   4: invokevirtual 291	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   7: iload_1
    //   8: invokevirtual 297	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   11: astore_3
    //   12: new 231	java/lang/StringBuilder
    //   15: dup
    //   16: ldc_w 299
    //   19: invokespecial 234	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   22: iload_1
    //   23: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   26: ldc_w 304
    //   29: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: aload_0
    //   33: getfield 21	com/google/android/gms/tagmanager/zzcn:mContext	Landroid/content/Context;
    //   36: invokevirtual 291	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   39: iload_1
    //   40: invokevirtual 308	android/content/res/Resources:getResourceName	(I)Ljava/lang/String;
    //   43: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: ldc_w 310
    //   49: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokestatic 106	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   58: new 42	java/io/ByteArrayOutputStream
    //   61: dup
    //   62: invokespecial 196	java/io/ByteArrayOutputStream:<init>	()V
    //   65: astore_2
    //   66: aload_3
    //   67: aload_2
    //   68: invokestatic 199	com/google/android/gms/internal/zzrs:zzb	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   71: aload_0
    //   72: aload_2
    //   73: invokespecial 312	com/google/android/gms/tagmanager/zzcn:zza	(Ljava/io/ByteArrayOutputStream;)Lcom/google/android/gms/internal/zzrs$zzc;
    //   76: astore_3
    //   77: aload_3
    //   78: ifnull +34 -> 112
    //   81: ldc_w 314
    //   84: invokestatic 106	com/google/android/gms/tagmanager/zzbg:v	(Ljava/lang/String;)V
    //   87: aload_3
    //   88: areturn
    //   89: astore_2
    //   90: new 231	java/lang/StringBuilder
    //   93: dup
    //   94: ldc_w 316
    //   97: invokespecial 234	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   100: iload_1
    //   101: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   104: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   107: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   110: aconst_null
    //   111: areturn
    //   112: aload_0
    //   113: aload_2
    //   114: invokevirtual 203	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   117: invokespecial 318	com/google/android/gms/tagmanager/zzcn:zzx	([B)Lcom/google/android/gms/internal/zzrs$zzc;
    //   120: astore_2
    //   121: aload_2
    //   122: areturn
    //   123: astore_2
    //   124: new 231	java/lang/StringBuilder
    //   127: dup
    //   128: ldc_w 320
    //   131: invokespecial 234	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: iload_1
    //   135: invokevirtual 302	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   138: ldc_w 304
    //   141: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: aload_0
    //   145: getfield 21	com/google/android/gms/tagmanager/zzcn:mContext	Landroid/content/Context;
    //   148: invokevirtual 291	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   151: iload_1
    //   152: invokevirtual 308	android/content/res/Resources:getResourceName	(I)Ljava/lang/String;
    //   155: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: ldc_w 310
    //   161: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 65	com/google/android/gms/tagmanager/zzbg:zzaK	(Ljava/lang/String;)V
    //   170: aconst_null
    //   171: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	zzcn
    //   0	172	1	paramInt	int
    //   65	8	2	localByteArrayOutputStream	ByteArrayOutputStream
    //   89	25	2	localNotFoundException	android.content.res.Resources.NotFoundException
    //   120	2	2	localzzc	zzrs.zzc
    //   123	1	2	localIOException	java.io.IOException
    //   11	77	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	12	89	android/content/res/Resources$NotFoundException
    //   58	77	123	java/io/IOException
    //   81	87	123	java/io/IOException
    //   112	121	123	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */