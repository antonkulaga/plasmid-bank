package club.diybio.bank.domain

case class PlasmidInsert(
  name: String,
  altNames: Set[String],
  species: Set[String],
  size: Int,
  promoter: Option[Promoter],
  genBankId: Option[String]
)
