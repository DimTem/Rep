package book.knight.classes;

public class DamselRescuingKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		quest = new RescueDamselQuest(); // ������ ����� � �������
	} // RescueDamselQuest

	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
}