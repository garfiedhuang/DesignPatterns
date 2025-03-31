package Adapter;

/*
 * 具体适配者类
 */
class VlcPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}

/*
 * 具体适配类
 */
class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

		System.out.println("Playing MP4 file. Name: " + fileName);
	}

}