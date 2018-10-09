package api.text.speech.google;


import com.sun.speech.freetts.VoiceManager; // cái này phải tải thư viện freetts về và import vào //project.

public class Speak {
    public static void speech(String text) {
        VoiceManager voiceManager = VoiceManager.getInstance();
        com.sun.speech.freetts.Voice syntheticVoice = voiceManager.getVoice("kevin16");
        syntheticVoice.allocate();
        syntheticVoice.speak(text);
        syntheticVoice.deallocate();
    }
}
